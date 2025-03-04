package io.hvk.meradostapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition


enum class AnimationType(val path: String) {
    Correct("animations/true.json"),
    Wrong("animations/false2.json")
}

@Composable
fun TrueAnimation(
    modifier: Modifier = Modifier,
    type: AnimationType,
    onClick: () -> Unit
) {
    val composition by rememberLottieComposition(
        LottieCompositionSpec.Asset(type.path)
    )

    val width = LocalConfiguration.current.screenWidthDp.dp / 2
    val progress by animateLottieCompositionAsState(
        composition = composition,
        iterations = 1
    )

    LaunchedEffect(progress) {
        if (progress == 1f) {
            onClick()
        }
    }
    Box(
        Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f)),
        contentAlignment = Alignment.Center
    ) {
        LottieAnimation(
            composition = composition,
            modifier = modifier
                .size(width)
                .pointerInput(Unit) { }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun Preview() {
    TrueAnimation(type = AnimationType.Correct) {}
}