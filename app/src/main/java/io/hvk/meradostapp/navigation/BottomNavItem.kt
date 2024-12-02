package io.hvk.meradostapp.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Quiz
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(
    val route: String,
    val icon: ImageVector,
    val title: String
) {
    object Home : BottomNavItem(
        route = Screen.Home.route,
        icon = Icons.Default.Home,
        title = "Home"
    )
    object Quiz : BottomNavItem(
        route = Screen.Quiz.route,
        icon = Icons.Default.Quiz,
        title = "Quiz"
    )
    object Settings : BottomNavItem(
        route = Screen.Settings.route,
        icon = Icons.Default.Settings,
        title = "Settings"
    )
} 