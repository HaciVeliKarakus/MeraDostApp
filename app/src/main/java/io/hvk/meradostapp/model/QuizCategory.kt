package io.hvk.meradostapp.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

data class QuizCategory(
    val id: String,
    val title: String,
    val description: String,
    val icon: ImageVector
)

val quizCategories = listOf(
    QuizCategory(
        id = "letters",
        title = "Letters",
        description = "Learn Hindi alphabet and basic characters",
        icon = Icons.Default.Abc
    ),
    QuizCategory(
        id = "numbers",
        title = "Numbers",
        description = "Master counting in Hindi",
        icon = Icons.Default.Numbers
    ),
    QuizCategory(
        id = "colors",
        title = "Colors",
        description = "Learn colors in Hindi",
        icon = Icons.Default.Palette
    ),
    QuizCategory(
        id = "family",
        title = "Family",
        description = "Family relationships in Hindi",
        icon = Icons.Default.People
    ),
    QuizCategory(
        id = "directions",
        title = "Directions",
        description = "Learn directional words in Hindi",
        icon = Icons.Default.Navigation
    ),
    QuizCategory(
        id = "animals",
        title = "Animals",
        description = "Common animal names in Hindi",
        icon = Icons.Default.Pets
    ),
    QuizCategory(
        id = "foods",
        title = "Foods",
        description = "Popular food items in Hindi",
        icon = Icons.Default.Restaurant
    )
) 