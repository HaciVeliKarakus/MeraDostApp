package io.hvk.meradostapp.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Quiz : Screen("quiz")
    object Settings : Screen("settings")
    
    // Quiz category screen
    object QuizCategory : Screen("quiz/{categoryId}") {
        fun createRoute(categoryId: String) = "quiz/$categoryId"
    }
} 