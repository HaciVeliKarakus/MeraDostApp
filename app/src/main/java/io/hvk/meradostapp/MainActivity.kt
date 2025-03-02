package io.hvk.meradostapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.CompositionLocalProvider
import androidx.lifecycle.ViewModelProvider
import io.hvk.meradostapp.data.PreferencesManager
import io.hvk.meradostapp.ui.screens.MainScreen
import io.hvk.meradostapp.ui.theme.LocalThemeState
import io.hvk.meradostapp.ui.theme.MeraDostAppTheme
import io.hvk.meradostapp.ui.theme.ThemeState
import io.hvk.meradostapp.ui.viewmodel.QuizViewModel

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

