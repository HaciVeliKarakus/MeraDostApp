package io.hvk.meradostapp.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Abc
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.EmojiEmotions
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.Numbers
import androidx.compose.material.icons.filled.Palette
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.filled.Pets
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.RecordVoiceOver
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material.icons.filled.Translate
import androidx.compose.material.icons.filled.WavingHand
import androidx.compose.material.icons.filled.WbSunny
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.hvk.meradostapp.model.LectureContent
import io.hvk.meradostapp.model.lectureCategories
import io.hvk.meradostapp.ui.components.AnimatedBackground
import io.hvk.meradostapp.util.pulseAnimation
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LectureDetailScreen(
    lectureId: String?,
    onBackClick: () -> Unit
) {
    val lecture = lectureCategories.find { it.id == lectureId }
    val lazyListState = rememberLazyListState()
    val scope = rememberCoroutineScope()

    val fabVisible by remember {
        derivedStateOf {
            lazyListState.firstVisibleItemIndex > 0 || lazyListState.firstVisibleItemScrollOffset > 0
        }
    }
    val scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior()

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = lecture?.title ?: "Lecture",
                        style = MaterialTheme.typography.headlineMedium,
                        color = MaterialTheme.colorScheme.onPrimary
                    )
                },
                navigationIcon = {
                    IconButton(
                        onClick = onBackClick,
                        modifier = Modifier
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back",
                            tint = MaterialTheme.colorScheme.onPrimary
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary,
                    actionIconContentColor = MaterialTheme.colorScheme.onPrimary
                ),
                actions = {
                    Icon(
                        imageVector = lecture?.icon ?: Icons.Default.Book,
                        contentDescription = null,
                        modifier = Modifier.size(48.dp),
                        tint = MaterialTheme.colorScheme.onPrimary
                    )
                },
                scrollBehavior = scrollBehavior
            )
        },
        floatingActionButton = {
            AnimatedVisibility(
                visible = fabVisible,
                enter = fadeIn() + scaleIn(),
                exit = fadeOut() + scaleOut()
            ) {
                FloatingActionButton(
                    onClick = {
                        scope.launch {
                            lazyListState.animateScrollToItem(0)
                            scrollBehavior.state.heightOffset = 0f
                            scrollBehavior.state.contentOffset = 0f
                        }
                    },
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    contentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                    modifier = Modifier
                        .pulseAnimation(true)
                        .border(2.dp, MaterialTheme.colorScheme.onSurface, CircleShape),
                    shape = CircleShape
                ) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowUp,
                        contentDescription = "Scroll to top"
                    )
                }
            }
        }
    ) { innerPadding ->
        LazyColumn(
            state = lazyListState,
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .nestedScroll(scrollBehavior.nestedScrollConnection),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(
                items = lecture?.content ?: emptyList(),
                key = { it.hindi + it.english }
            ) { content ->
                AnimatedCard(content = content)
            }
        }
    }
}

@Composable
fun AnimatedCard(content: LectureContent) {
    var isVisible by remember { mutableStateOf(false) }
    val scale = remember { Animatable(0.8f) }
    val alpha = remember { Animatable(0f) }
    val offsetY = remember { Animatable(50f) }

    LaunchedEffect(Unit) {
        isVisible = true
        launch {
            scale.animateTo(
                targetValue = 1f,
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioLowBouncy,
                    stiffness = Spring.StiffnessLow
                )
            )
        }
        launch {
            alpha.animateTo(
                targetValue = 1f,
                animationSpec = tween(
                    durationMillis = 500,
                    easing = FastOutSlowInEasing
                )
            )
        }
        launch {
            offsetY.animateTo(
                targetValue = 0f,
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioMediumBouncy,
                    stiffness = Spring.StiffnessVeryLow
                )
            )
        }
    }

    Box(
        modifier = Modifier
            .scale(scale.value)
            .alpha(alpha.value)
//            .offset(y = offsetY.value.dp)
            .offset { IntOffset(x = 0, y = offsetY.value.toInt()) }
            .animateContentSize(
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioMediumBouncy,
                    stiffness = Spring.StiffnessLow
                )
            )
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

    val fontSize = when {
        content.hindi.length <= 3 -> 80.sp  // Short text like "घर"
        content.hindi.length <= 6 -> 60.sp  // Medium text like "किताब"
        content.hindi.length <= 10 -> 48.sp // Longer text like "आश्चर्यचकित"
        content.hindi.length <= 15 -> 36.sp // Very long text
        else -> 28.sp                       // Extremely long text
    }

    ElevatedCard(
        modifier = Modifier
            .fillMaxWidth()
            .scale(scale.value)
            .clickable { }
            .shadow(
                elevation = 8.dp,
                shape = RoundedCornerShape(16.dp)
            )
            .border(2.dp, MaterialTheme.colorScheme.onSurface, RoundedCornerShape(16.dp)),
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = when (lectureId) {
                        "letters" -> Icons.Default.Abc
                        "numbers" -> Icons.Default.Numbers
                        "colors" -> Icons.Default.Palette
                        "family" -> Icons.Default.People
                        "animals" -> Icons.Default.Pets
                        "food" -> Icons.Default.Restaurant
                        "greetings" -> Icons.Default.WavingHand
                        "time" -> Icons.Default.Schedule
                        "weather" -> Icons.Default.WbSunny
                        "emotions" -> Icons.Default.EmojiEmotions
                        "places" -> Icons.Default.Place
                        else -> Icons.Default.Book
                    },
                    contentDescription = null,
                    modifier = Modifier.size(24.dp),
                    tint = MaterialTheme.colorScheme.primary
                )

                Text(
                    text = when (lectureId) {
                        "letters" -> "Letter"
                        "numbers" -> "Number"
                        "colors" -> "Color"
                        "family" -> "Family"
                        "animals" -> "Animal"
                        "food" -> "Food"
                        "greetings" -> "Greeting"
                        "time" -> "Time"
                        "weather" -> "Weather"
                        "emotions" -> "Emotion"
                        "places" -> "Place"
                        else -> ""
                    },
                    style = MaterialTheme.typography.labelMedium,
                    color = MaterialTheme.colorScheme.primary
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(160.dp)
                    .clip(RoundedCornerShape(12.dp))
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

                            else -> MaterialTheme.colorScheme.surfaceVariant.copy(
                                alpha = if (isSystemInDarkTheme()) 0.12f else 0.08f
                            )
                        }
                    ),
                contentAlignment = Alignment.Center
            ) {
                if (lectureId == "animals") {
                    AnimatedBackground(
                        animalType = content.english,
                        modifier = Modifier
                            .fillMaxSize()
                            .alpha(0.3f)
                    )
                }

                Text(
                    text = content.hindi,
                    style = MaterialTheme.typography.displayLarge.copy(
                        fontSize = fontSize,  // Dynamic font size
                        fontWeight = FontWeight.Bold,
                        lineHeight = fontSize.times(1.2f)  // Proper line height
                    ),
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    textAlign = TextAlign.Center,
                    maxLines = 2,  // Allow max 2 lines
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // English translation with icon
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.Translate,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.primary
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = content.english,
                    style = MaterialTheme.typography.titleLarge,
                    color = MaterialTheme.colorScheme.onSurface
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Pronunciation with icon
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.RecordVoiceOver,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.secondary
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = content.pronunciation,
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }

            if (content.example != null) {
                Spacer(modifier = Modifier.height(8.dp))
                // Example with icon
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.Top
                ) {
                    Icon(
                        imageVector = Icons.Default.Info,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.tertiary
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = content.example,
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        }
    }
}

// Add CompositionLocal to access lectureId
private val LocalLectureId = compositionLocalOf<String?> { null }


@Preview(showBackground = true)
@Composable
private fun Preview() {
    LectureDetailScreen("letters") { }
}