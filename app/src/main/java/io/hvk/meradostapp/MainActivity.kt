package io.hvk.meradostapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Quiz
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.dp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import io.hvk.meradostapp.data.PreferencesManager
import io.hvk.meradostapp.navigation.BottomNavItem
import io.hvk.meradostapp.navigation.Screen
import io.hvk.meradostapp.ui.screens.*
import io.hvk.meradostapp.ui.theme.LocalThemeState
import io.hvk.meradostapp.ui.theme.MeraDostAppTheme
import io.hvk.meradostapp.ui.theme.ThemeState
import io.hvk.meradostapp.ui.viewmodel.QuizViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel

class MainActivity : ComponentActivity() {
    private lateinit var themeState: ThemeState
    private lateinit var quizViewModel: QuizViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val preferencesManager = PreferencesManager(applicationContext)
        themeState = ThemeState(preferencesManager)
        quizViewModel = ViewModelProvider(this)[QuizViewModel::class.java]
        
        enableEdgeToEdge()
        setContent {
            CompositionLocalProvider(LocalThemeState provides themeState) {
                MeraDostAppTheme {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    
    // Determine if we should show the bottom bar
    val shouldShowBottomBar = when (navBackStackEntry?.destination?.route) {
        Screen.Home.route, Screen.Quiz.route -> true
        else -> false
    }

    Scaffold(
        bottomBar = {
            AnimatedVisibility(
                visible = shouldShowBottomBar,
                enter = slideInVertically(initialOffsetY = { it }),
                exit = slideOutVertically(targetOffsetY = { it })
            ) {
                NavigationBar {
                    val currentRoute = navBackStackEntry?.destination?.route

                    // Home tab
                    NavigationBarItem(
                        icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                        label = { Text("Learn") },
                        selected = currentRoute == Screen.Home.route,
                        onClick = {
                            navController.navigate(Screen.Home.route) {
                                popUpTo(navController.graph.startDestinationId)
                                launchSingleTop = true
                            }
                        }
                    )

                    // Quiz tab
                    NavigationBarItem(
                        icon = { Icon(Icons.Default.Quiz, contentDescription = "Quiz") },
                        label = { Text("Quiz") },
                        selected = currentRoute == Screen.Quiz.route,
                        onClick = {
                            navController.navigate(Screen.Quiz.route) {
                                popUpTo(navController.graph.startDestinationId)
                                launchSingleTop = true
                            }
                        }
                    )
                }
            }
        }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(
                start = paddingValues.calculateStartPadding(LocalLayoutDirection.current),
                end = paddingValues.calculateEndPadding(LocalLayoutDirection.current),
                top = paddingValues.calculateTopPadding(),
                bottom = if (shouldShowBottomBar) paddingValues.calculateBottomPadding() else 0.dp
            )
        ) {
            composable(Screen.Home.route) {
                HomeScreen(
                    onLectureClick = { lectureId ->
                        navController.navigate(Screen.LectureDetail.createRoute(lectureId))
                    }
                )
            }
            composable(Screen.Quiz.route) {
                QuizScreen(
                    quizViewModel = viewModel(),
                    onCategoryClick = { categoryId ->
                        navController.navigate(Screen.QuizCategory.createRoute(categoryId))
                    }
                )
            }
            composable(
                Screen.LectureDetail.route,
                arguments = listOf(navArgument("lectureId") { type = NavType.StringType })
            ) { backStackEntry ->
                LectureDetailScreen(
                    lectureId = backStackEntry.arguments?.getString("lectureId"),
                    onBackClick = { navController.popBackStack() }
                )
            }
            composable(
                Screen.QuizCategory.route,
                arguments = listOf(navArgument("categoryId") { type = NavType.StringType })
            ) { backStackEntry ->
                QuizCategoryScreen(
                    categoryId = backStackEntry.arguments?.getString("categoryId"),
                    quizViewModel = viewModel(),
                    onBackClick = { navController.popBackStack() }
                )
            }
        }
    }
}