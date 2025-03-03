package io.hvk.meradostapp.util

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
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

@Composable
fun Modifier.pulseAnimation(isActive: Boolean): Modifier {
    val infiniteTransition = rememberInfiniteTransition(label = "pulse")

    val scale by infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = 1.2f,
        animationSpec = infiniteRepeatable(
            animation = tween(1000, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "scale"
    )

    return this.scale(if (isActive) scale else 1f)
}
