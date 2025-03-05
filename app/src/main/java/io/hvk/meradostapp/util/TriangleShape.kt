package io.hvk.meradostapp.util

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.hvk.meradostapp.ui.theme.MeraDostAppTheme

val TriangleShape = GenericShape { size: Size, _ ->
    moveTo(size.width / 2, 0f) // Üçgenin üst noktası (tepe)
    lineTo(0f, size.height)    // Sol alt köşe
    lineTo(size.width, size.height)  // Sağ alt köşe
    close()  // Şekli kapat
}

@Preview(showBackground = true)
@Composable
private fun Preview() {
    MeraDostAppTheme {
        Icons.Default.Home
        Box(
            modifier = Modifier
                .size(100.dp)
                .border(2.dp, Color.Red, TriangleShape)
        )
    }
}