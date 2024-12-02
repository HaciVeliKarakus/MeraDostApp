package io.hvk.meradostapp.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Quiz : Screen("quiz")
    object Settings : Screen("settings")
} 