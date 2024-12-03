package io.hvk.meradostapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import io.hvk.meradostapp.data.PreferencesManager
import io.hvk.meradostapp.navigation.BottomNavItem
import io.hvk.meradostapp.navigation.Screen
import io.hvk.meradostapp.ui.screens.*
import io.hvk.meradostapp.ui.theme.LocalThemeState
import io.hvk.meradostapp.ui.theme.MeraDostAppTheme
import io.hvk.meradostapp.ui.theme.ThemeState

class MainActivity : ComponentActivity() {
    private lateinit var themeState: ThemeState

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Initialize PreferencesManager and ThemeState
        val preferencesManager = PreferencesManager(applicationContext)
        themeState = ThemeState(preferencesManager)
        
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
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
                composable(Screen.Home.route) { HomeScreen() }
                composable(Screen.Quiz.route) { QuizScreen() }
                composable(Screen.Settings.route) { SettingsScreen() }
            }
        }
    }
}