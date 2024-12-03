package io.hvk.meradostapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import io.hvk.meradostapp.ui.theme.LocalThemeState

@Composable
fun SettingsScreen() {
    val themeState = LocalThemeState.current
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Settings",
            style = MaterialTheme.typography.headlineMedium
        )
        Spacer(modifier = Modifier.height(16.dp))
        
        // Settings List
        ElevatedCard(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column {
                ListItem(
                    headlineContent = { Text("Dark Mode") },
                    trailingContent = {
                        Switch(
                            checked = themeState.isDarkMode,
                            onCheckedChange = { 
                                themeState.toggleTheme(it)
                            }
                        )
                    }
                )
                Divider()
                ListItem(
                    headlineContent = { Text("Clear Progress") },
                    supportingContent = { Text("Reset all your learning progress") },
                    trailingContent = {
                        TextButton(
                            onClick = { /* Show confirmation dialog */ }
                        ) {
                            Text("Clear")
                        }
                    }
                )
            }
        }
    }
} 