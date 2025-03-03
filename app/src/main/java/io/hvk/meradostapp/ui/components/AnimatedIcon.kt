package io.hvk.meradostapp.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.hvk.meradostapp.util.flipYAnimation
import io.hvk.meradostapp.util.pulseAnimation
import kotlinx.coroutines.delay
import kotlin.random.Random

@Composable
fun AnimatedIcon(
    icon: ImageVector,
    iconSize: Dp = 16.dp,
    contentDescription: String? = null,
    modifier: Modifier = Modifier,
    isSelected: Boolean = true
) {
    var isFlipped by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        while (true) {
            delay(Random.nextLong(1_000, 10_000))
            isFlipped = !isFlipped
        }
    }

    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = icon,
            contentDescription = contentDescription,
            modifier = Modifier
                .size(iconSize)
                .pulseAnimation(isSelected)
                .flipYAnimation(isFlipped),
            tint = MaterialTheme.colorScheme.primary
        )
    }
} 