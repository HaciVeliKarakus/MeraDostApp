package io.hvk.meradostapp.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import io.hvk.meradostapp.data.PreferencesManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ThemeState(private val preferencesManager: PreferencesManager) {
    var isDarkMode by mutableStateOf(false)
        private set

    private val scope = CoroutineScope(Dispatchers.IO)

    init {
        // Load initial theme preference
        scope.launch {
            preferencesManager.isDarkMode.collect { darkMode ->
                isDarkMode = darkMode
            }
        }
    }

    fun toggleTheme(enabled: Boolean) {
        scope.launch {
            preferencesManager.setDarkMode(enabled)
        }
    }
}

val LocalThemeState = staticCompositionLocalOf<ThemeState> { 
    error("No ThemeState provided") 
} 