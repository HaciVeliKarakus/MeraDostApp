package io.hvk.meradostapp.ui.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.airbnb.lottie.compose.*

@Composable
fun AnimatedBackground(
    animalType: String,
    modifier: Modifier = Modifier
) {
    val composition by rememberLottieComposition(
        spec = LottieCompositionSpec.Asset(
            when (animalType.lowercase()) {
                "dog" -> "animations/dog.json"
                "cat" -> "animations/cat.json"
                "elephant" -> "animations/elephant.json"
                "lion" -> "animations/lion.json"
                "tiger" -> "animations/tiger.json"
                "monkey" -> "animations/monkey.json"
                "cow" -> "animations/cow.json"
                "bear" -> "animations/bear.json"
                "rabbit" -> "animations/rabbit.json"
                "bird", "parrot", "pigeon", "crow", "peacock" -> "animations/bird.json"
                "butterfly" -> "animations/butterfly.json"
                "bee" -> "animations/bee.json"
                "ant" -> "animations/ant.json"
                "fish" -> "animations/fish.json"
                "whale" -> "animations/whale.json"
                else -> "animations/default_animal.json"
            }
        )
    )

    val progress by animateLottieCompositionAsState(
        composition = composition,
        iterations = LottieConstants.IterateForever
    )

    LottieAnimation(
        composition = composition,
        progress = { progress },
        modifier = modifier.fillMaxSize()
    )
} 