package io.hvk.meradostapp.ui.screens

import androidx.compose.animation.*
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Boy
import androidx.compose.material.icons.filled.Elderly
import androidx.compose.material.icons.filled.ElderlyWoman
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Face4
import androidx.compose.material.icons.filled.Girl
import androidx.compose.material.icons.filled.Man
import androidx.compose.material.icons.filled.Man4
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Person4
import androidx.compose.material.icons.filled.Woman
import androidx.compose.material.icons.filled.Woman2
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.hvk.meradostapp.model.LectureContent
import io.hvk.meradostapp.model.lectureCategories

@Composable
fun LectureDetailScreen(
    lectureId: String?,
    onBackClick: () -> Unit
) {
    val lecture = lectureCategories.find { it.id == lectureId }
    
    CompositionLocalProvider(LocalLectureId provides lectureId) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text(
                text = lecture?.title ?: "Lecture",
                style = MaterialTheme.typography.headlineMedium
            )
            
            Spacer(modifier = Modifier.height(16.dp))
            
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(
                    items = lecture?.content ?: emptyList(),
                    key = { it.hindi + it.english } // Use hindi text as stable key
                ) { content ->
                    AnimatedCard(content = content)
                }
            }
        }
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun AnimatedCard(content: LectureContent) {
    var isVisible by remember { mutableStateOf(false) }
    
    LaunchedEffect(Unit) {
        isVisible = true
    }
    
    AnimatedVisibility(
        visible = isVisible,
        enter = slideInVertically(
            initialOffsetY = { it * 2 },
            animationSpec = spring(
                dampingRatio = Spring.DampingRatioMediumBouncy,
                stiffness = Spring.StiffnessLow
            )
        ) + fadeIn(
            animationSpec = tween(durationMillis = 300)
        ),
        modifier = Modifier.animateContentSize()
    ) {
        LectureContentCard(content = content)
    }
}

@Composable
fun LectureContentCard(content: LectureContent) {
    val lectureId = LocalLectureId.current
    val scale = remember { Animatable(0.8f) }
    
    LaunchedEffect(Unit) {
        scale.animateTo(
            targetValue = 1f,
            animationSpec = spring(
                dampingRatio = Spring.DampingRatioMediumBouncy,
                stiffness = Spring.StiffnessLow
            )
        )
    }
    
    ElevatedCard(
        modifier = Modifier
            .fillMaxWidth()
            .scale(scale.value)
            .clickable {
                // Add ripple effect on click
            }
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(
                        when {
                            lectureId == "colors" -> when (content.english.lowercase()) {
                                "red" -> Color(0xFFE53935)
                                "blue" -> Color(0xFF1E88E5)
                                "yellow" -> Color(0xFFFDD835)
                                "green" -> Color(0xFF43A047)
                                "black" -> Color(0xFF212121)
                                "white" -> Color(0xFFFFFFFF)
                                "orange" -> Color(0xFFFF9800)
                                "pink" -> Color(0xFFE91E63)
                                "purple" -> Color(0xFF9C27B0)
                                "brown" -> Color(0xFF795548)
                                "grey" -> Color(0xFF9E9E9E)
                                "golden" -> Color(0xFFFFD700)
                                "silver" -> Color(0xFFC0C0C0)
                                "dark blue" -> Color(0xFF0D47A1)
                                "light blue" -> Color(0xFF03A9F4)
                                else -> MaterialTheme.colorScheme.surfaceVariant
                            }
                            else -> MaterialTheme.colorScheme.surfaceVariant
                        }
                    ),
                contentAlignment = Alignment.Center
            ) {
                if (lectureId == "family") {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            imageVector = when (content.english.lowercase()) {
                                "mother" -> Icons.Default.Face
                                "father" -> Icons.Default.Face4
                                "elder brother", "younger brother" -> Icons.Default.Man
                                "elder sister", "younger sister" -> Icons.Default.Woman
                                "paternal grandfather", "maternal grandfather" -> Icons.Default.Elderly
                                "paternal grandmother", "maternal grandmother" -> Icons.Default.ElderlyWoman
                                "paternal uncle", "maternal uncle", "elder paternal uncle", "maternal aunt's husband" -> Icons.Default.Man4
                                "paternal aunt", "maternal aunt", "elder paternal aunt" -> Icons.Default.Woman2
                                "son" -> Icons.Default.Boy
                                "daughter" -> Icons.Default.Girl
                                "paternal cousin brother", "maternal cousin brother" -> Icons.Default.Person
                                "paternal cousin sister", "maternal cousin sister" -> Icons.Default.Person4
                                else -> Icons.Default.Person
                            },
                            contentDescription = content.english,
                            modifier = Modifier.size(100.dp),
                            tint = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = content.hindi,
                            style = MaterialTheme.typography.displayLarge.copy(
                                fontSize = 60.sp,
                                fontWeight = FontWeight.Bold
                            ),
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                } else {
                    Text(
                        text = content.hindi,
                        style = MaterialTheme.typography.displayLarge.copy(
                            fontSize = 120.sp,
                            fontWeight = FontWeight.Bold
                        ),
                        color = if (lectureId == "colors") {
                            when (content.english.lowercase()) {
                                "white", "yellow", "light blue", "golden", "silver" -> Color.Black
                                else -> Color.White
                            }
                        } else {
                            MaterialTheme.colorScheme.onSurfaceVariant
                        }
                    )
                }
            }
            
            Spacer(modifier = Modifier.height(16.dp))
            
            Text(
                text = content.english,
                style = MaterialTheme.typography.titleLarge
            )
            
            Text(
                text = "Pronunciation: ${content.pronunciation}",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            
            if (content.example != null) {
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Example: ${content.example}",
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
    }
}

// Add CompositionLocal to access lectureId
private val LocalLectureId = compositionLocalOf<String?> { null } 