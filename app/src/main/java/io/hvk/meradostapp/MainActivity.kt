package io.hvk.meradostapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
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
                    MainScreen(quizViewModel)
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(quizViewModel: QuizViewModel) {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    
    Surface(
        color = MaterialTheme.colorScheme.background
    ) {
        Scaffold(
            bottomBar = {
                NavigationBar {
                    listOf(
                        BottomNavItem.Home,
                        BottomNavItem.Quiz,
                        BottomNavItem.Settings
                    ).forEach { item ->
                        NavigationBarItem(
                            icon = { Icon(item.icon, contentDescription = item.title) },
                            label = { Text(item.title) },
                            selected = currentRoute == item.route,
                            onClick = {
                                navController.navigate(item.route) {
                                    popUpTo(navController.graph.startDestinationId)
                                    launchSingleTop = true
                                }
                            }
                        )
                    }
                }
            }
        ) { innerPadding ->
            NavHost(
                navController = navController,
                startDestination = Screen.Home.route,
                modifier = Modifier.padding(innerPadding)
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
                        quizViewModel = quizViewModel,
                        onCategoryClick = { categoryId ->
                            navController.navigate(Screen.QuizCategory.createRoute(categoryId))
                        }
                    )
                }
                composable(
                    route = Screen.QuizCategory.route,
                    arguments = listOf(navArgument("categoryId") { type = NavType.StringType })
                ) { backStackEntry ->
                    val categoryId = backStackEntry.arguments?.getString("categoryId")
                    QuizCategoryScreen(
                        categoryId = categoryId,
                        quizViewModel = quizViewModel,
                        onBackClick = { navController.navigateUp() }
                    )
                }
                composable(Screen.Settings.route) { 
                    SettingsScreen(
                        onClearProgress = { quizViewModel.clearAllProgress() }
                    )
                }
                composable(
                    route = Screen.LectureDetail.route,
                    arguments = listOf(navArgument("lectureId") { type = NavType.StringType })
                ) { backStackEntry ->
                    val lectureId = backStackEntry.arguments?.getString("lectureId")
                    LectureDetailScreen(
                        lectureId = lectureId,
                        onBackClick = { navController.navigateUp() }
                    )
                }
            }
        }
    }
}