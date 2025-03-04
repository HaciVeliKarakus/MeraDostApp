package io.hvk.meradostapp.ui.components

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition

@Composable
fun FalseAnimation(modifier: Modifier = Modifier) {
    val composition by rememberLottieComposition(
        LottieCompositionSpec.Asset("animations/false2.json")
    )

    val width = LocalConfiguration.current.screenWidthDp.dp / 2


    LottieAnimation(
        composition = composition,
        modifier = modifier.size(width)
    )
}

@Preview(showBackground = true)
@Composable
private fun Preview() {
    FalseAnimation()
}