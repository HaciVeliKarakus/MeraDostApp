package io.hvk.meradostapp.util

import androidx.compose.foundation.border
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable

@Composable
fun Modifier.boldBorder(
    width: Dp = 2.dp,
    color: Color = MaterialTheme.colorScheme.onSurface,
    shape: RoundedCornerShape = RoundedCornerShape(16.dp)
): Modifier {
    return this.then(
        Modifier.border(width, color, shape)
    )
}
