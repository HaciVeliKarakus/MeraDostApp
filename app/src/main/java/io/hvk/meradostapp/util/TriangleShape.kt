package io.hvk.meradostapp.util

import androidx.compose.foundation.shape.GenericShape
import androidx.compose.ui.geometry.Size

val TriangleShape = GenericShape { size: Size, _ ->
    moveTo(size.width / 2, 0f) // Üçgenin üst noktası (tepe)
    lineTo(0f, size.height)    // Sol alt köşe
    lineTo(size.width, size.height)  // Sağ alt köşe
    close()  // Şekli kapat
}