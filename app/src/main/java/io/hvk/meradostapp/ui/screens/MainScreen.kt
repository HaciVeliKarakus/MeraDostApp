package io.hvk.meradostapp.ui.screens

import android.annotation.SuppressLint
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Quiz
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import io.hvk.meradostapp.navigation.Screen
import io.hvk.meradostapp.ui.theme.MeraDostAppTheme

private val navItems = listOf(
    Screen.Home to Icons.Default.Home to "Learn",
    Screen.Quiz to Icons.Default.Quiz to "Quiz"
)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()

    val shouldShowBottomBar = when (navBackStackEntry?.destination?.route) {
        Screen.Home.route, Screen.Quiz.route -> true
        else -> false
    }
    val surfaceColor = MaterialTheme.colorScheme.onSurface
    Scaffold(
        bottomBar = {
            AnimatedVisibility(
                visible = shouldShowBottomBar,
                enter = slideInVertically(initialOffsetY = { it }),
                exit = slideOutVertically(targetOffsetY = { it })
            ) {
                NavigationBar(
                    modifier = Modifier
                        .drawBehind {
                            drawLine(
                                color = surfaceColor,
                                start = Offset(0f,0f),
                                end = Offset(size.width,0f),
                                strokeWidth = 1.dp.toPx()
                            )
                        },
                ) {
                    val currentRoute = navBackStackEntry?.destination?.route

                    navItems.forEach { (screen, label) ->
                        NavigationBarItem(
                            icon = { Icon(screen.second, contentDescription = label) },
                            label = { Text(label) },
                            selected = currentRoute == screen.first.route,
                            onClick = {
                                navController.navigate(screen.first.route) {
                                    popUpTo(navController.graph.startDestinationId)
                                    launchSingleTop = true
                                }
                            },
                            colors = NavigationBarItemDefaults.colors(
                                selectedIconColor = MaterialTheme.colorScheme.primary,
                                selectedTextColor = MaterialTheme.colorScheme.primary,
                                indicatorColor = MaterialTheme.colorScheme.onPrimary
//                                selectedTextColor = MaterialTheme.colorScheme.onSecondary,
//                                indicatorColor = MaterialTheme.colorScheme.onSecondary,
                            )
                        )
                    }
                }
            }
        }
    ) {
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route
//            modifier = Modifier.padding(
//                start = paddingValues.calculateStartPadding(LocalLayoutDirection.current),
//                end = paddingValues.calculateEndPadding(LocalLayoutDirection.current),
//                top = paddingValues.calculateTopPadding(),
//                bottom = if (shouldShowBottomBar) paddingValues.calculateBottomPadding() else 0.dp
//            )
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
                    onBackClick = { navController.navigateUp() }
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


@PreviewLightDark
@Preview(showBackground = true)
@Composable
private fun Preview() {
    MeraDostAppTheme {
        MainScreen()
    }
}