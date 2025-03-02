package io.hvk.meradostapp.ui.components

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CoinFlipAnimation() {
    val rotationY = remember { Animatable(0f) }
    val scale = remember { Animatable(1f) }

    LaunchedEffect(Unit) {
        var speed = 200
        repeat(10) {
            rotationY.animateTo(
                targetValue = rotationY.value + 360f,
                animationSpec = tween(durationMillis = speed, easing = LinearEasing)
            )
            scale.animateTo(
                targetValue = if (it % 2 == 0) 0.8f else 1f,
                animationSpec = tween(durationMillis = speed / 2, easing = LinearEasing)
            )
            speed += 100
        }
    }

    Box(
        modifier = Modifier
            .size(100.dp)
            .graphicsLayer(
                rotationY = rotationY.value,
                scaleX = scale.value,
                scaleY = scale.value
            )
            .background(Color(0xFF4CAF50), shape = CircleShape),
        contentAlignment = Alignment.Center
    ) {
        Text("💰", fontSize = 32.sp)  // Bozuk para (emoji ile gösterildi)
    }
}


@Preview(showBackground = true)
@Composable
private fun Preview() {
    CoinFlipAnimation()
}