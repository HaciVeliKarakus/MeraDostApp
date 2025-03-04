package io.hvk.meradostapp.ui.components

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.times

@Composable
fun SwitchNavigationBar(
    selectedIndex: Int,
    onTabSelected: (Int) -> Unit
) {
    val screenWidth = LocalConfiguration.current.screenWidthDp.dp

    val items = listOf("Home", "Search")
    val tabWidth = screenWidth / items.size // Her tab için eşit genişlik

    val animatedOffset by animateDpAsState(
        targetValue = selectedIndex * tabWidth,
        label = "Tab Animation"
    )

    val animatedBorderWidth by animateDpAsState(
        targetValue = if (selectedIndex >= 0) 4.dp else 2.dp,
        label = "Border Animation"
    )

    val rotationAngle by animateFloatAsState(
        targetValue = if (selectedIndex >= 0) 360f else 0f,
        animationSpec = tween(1_000, easing = FastOutSlowInEasing),
        label = "Rotation Animation"
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp) // Navigation bar yüksekliği
            .background(Color(0xFFE0E0E0)) // Genel arka plan rengi
    ) {
        // Kayma efekti (Switch)
        Box(
            modifier = Modifier
                .offset(x = animatedOffset)
                .width(tabWidth) // Her bir tab genişliği
                .height(56.dp)
                .clip(RoundedCornerShape(24.dp))
                .background(MaterialTheme.colorScheme.primary)
                .border(
                    animatedBorderWidth,
                    Color.White,
                    RoundedCornerShape(24.dp)
                ) // Hareketli border
                .align(Alignment.CenterStart)
        )

        // Navigation Items
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            items.forEachIndexed { index, item ->
                Text(
                    text = item,
                    color = if (selectedIndex == index) Color.White else Color.Black,
                    modifier = Modifier
                        .clickable { onTabSelected(index) }
                        .padding(16.dp)
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun Preview() {
    var selectedTab by remember { mutableStateOf(0) }

    Column(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier.weight(1f)) {
            when (selectedTab) {
                0 -> Text("Home Screen", Modifier.align(Alignment.Center))
                1 -> Text("Search Screen", Modifier.align(Alignment.Center))
//                2 -> Text("Profile Screen", Modifier.align(Alignment.Center))
            }
        }

        SwitchNavigationBar(
            selectedIndex = selectedTab,
            onTabSelected = { selectedTab = it }
        )
    }
}