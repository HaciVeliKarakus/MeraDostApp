package io.hvk.meradostapp.util

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer

@Composable
fun Modifier.flipYAnimation(isFlipped: Boolean, duration: Int = 500): Modifier {
    val rotationY by animateFloatAsState(
        targetValue = if (isFlipped) 360f else 0f,
        animationSpec = tween(durationMillis = duration, easing = LinearEasing),
        label = "flipY"
    )
    return this.graphicsLayer(rotationY = rotationY)
}