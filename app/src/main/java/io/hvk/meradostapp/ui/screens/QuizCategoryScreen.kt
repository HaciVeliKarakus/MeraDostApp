package io.hvk.meradostapp.ui.screens

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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Button
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SheetState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import io.hvk.meradostapp.model.QuizData
import io.hvk.meradostapp.ui.components.AnimationType
import io.hvk.meradostapp.ui.components.TrueAnimation
import io.hvk.meradostapp.ui.viewmodel.QuizViewModel
import io.hvk.meradostapp.util.boldBorder
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuizCategoryScreen(
    categoryId: String?,
    quizViewModel: QuizViewModel,
    onBackClick: () -> Unit
) {
    val quizzes = QuizData.getQuizzesByCategory(categoryId ?: "")
    var currentQuizIndex by remember { mutableIntStateOf(0) }
    var selectedAnswer by remember { mutableStateOf<String?>(null) }
    var isAnswerChecked by remember { mutableStateOf(false) }
    var correctAnswers by remember { mutableIntStateOf(0) }

    val sheetState = rememberModalBottomSheetState()
    var showResults by remember { mutableStateOf(false) }
    val scope = rememberCoroutineScope()

    if (showResults) {
        QuizResultBottomSheet(
            correctAnswers = correctAnswers,
            totalQuestions = quizzes.size,
            sheetState = sheetState,
            onDismiss = {
                scope.launch {
                    sheetState.hide()
                    onBackClick()
                }
            },
            onRetry = {
                currentQuizIndex = 0
                correctAnswers = 0
                selectedAnswer = null
                isAnswerChecked = false
                showResults = false
            }
        )
    }

    fun goNext() {
        currentQuizIndex++
        selectedAnswer = null
        isAnswerChecked = false
    }

    fun showResult() {
        quizViewModel.updateQuizAttempt(
            categoryId = categoryId ?: "",
            completedQuizzes = quizzes.size,
            score = (correctAnswers * 100) / quizzes.size
        )
        showResults = true
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Question ${currentQuizIndex + 1}/${quizzes.size}",
                        style = MaterialTheme.typography.titleLarge,
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
            )
        }
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .background(MaterialTheme.colorScheme.secondary)
                    .boldBorder(shape = RoundedCornerShape(0)),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = quizzes[currentQuizIndex].question,
                    style = MaterialTheme.typography.headlineMedium,
                    color = MaterialTheme.colorScheme.onPrimary,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Row(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    // First option
                    QuizOptionButton(
                        option = quizzes[currentQuizIndex].options[0],
                        isSelected = selectedAnswer == quizzes[currentQuizIndex].options[0],
                        isCorrect = isAnswerChecked && quizzes[currentQuizIndex].options[0] == quizzes[currentQuizIndex].correctAnswer,
                        isEnabled = !isAnswerChecked,
                        modifier = Modifier.weight(1f)
                    ) {
                        selectedAnswer = quizzes[currentQuizIndex].options[0]
                    }

                    // Second option
                    QuizOptionButton(
                        option = quizzes[currentQuizIndex].options[1],
                        isSelected = selectedAnswer == quizzes[currentQuizIndex].options[1],
                        isCorrect = isAnswerChecked && quizzes[currentQuizIndex].options[1] == quizzes[currentQuizIndex].correctAnswer,
                        isEnabled = !isAnswerChecked,
                        modifier = Modifier.weight(1f)
                    ) {
                        selectedAnswer = quizzes[currentQuizIndex].options[1]
                    }
                }

                // Second row
                Row(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    // Third option
                    QuizOptionButton(
                        option = quizzes[currentQuizIndex].options[2],
                        isSelected = selectedAnswer == quizzes[currentQuizIndex].options[2],
                        isCorrect = isAnswerChecked && quizzes[currentQuizIndex].options[2] == quizzes[currentQuizIndex].correctAnswer,
                        isEnabled = !isAnswerChecked,
                        modifier = Modifier.weight(1f)
                    ) {
                        selectedAnswer = quizzes[currentQuizIndex].options[2]
                    }

                    // Fourth option
                    QuizOptionButton(
                        option = quizzes[currentQuizIndex].options[3],
                        isSelected = selectedAnswer == quizzes[currentQuizIndex].options[3],
                        isCorrect = isAnswerChecked && quizzes[currentQuizIndex].options[3] == quizzes[currentQuizIndex].correctAnswer,
                        isEnabled = !isAnswerChecked,
                        modifier = Modifier.weight(1f)
                    ) {
                        selectedAnswer = quizzes[currentQuizIndex].options[3]
                    }
                }
            }

            // Check Answer / Next Question button
            Button(
                onClick = {
                    if (isAnswerChecked) {
                        if (currentQuizIndex == quizzes.size - 1) {
                            showResult()
                        } else {
                            // Move to next question
                            goNext()

                        }
                    } else {
                        // Check answer
                        isAnswerChecked = true
                        if (selectedAnswer == quizzes[currentQuizIndex].correctAnswer) {
                            correctAnswers++
                        }
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .boldBorder(shape = RoundedCornerShape(50)),
                enabled = selectedAnswer != null
            ) {
                Text(
                    text = when {
                        isAnswerChecked && currentQuizIndex == quizzes.size - 1 -> "Finish Quiz"
                        isAnswerChecked -> "Next Question"
                        else -> "Check Answer"
                    },
                    style = MaterialTheme.typography.titleMedium
                )
            }
        }

        if (isAnswerChecked) {
            if (currentQuizIndex == quizzes.size - 1) {
                showResult()
            } else {
                TrueAnimation(
                    type = if (selectedAnswer == quizzes[currentQuizIndex].correctAnswer)
                        AnimationType.Correct
                    else AnimationType.Wrong
                ) { goNext() }
            }
        }
    }
}

@Composable
fun QuizOptionButton(
    option: String,
    isSelected: Boolean,
    isCorrect: Boolean,
    isEnabled: Boolean,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    val backgroundColor = when {
        !isEnabled && isCorrect -> MaterialTheme.colorScheme.primary.copy(alpha = 0.6f)
        isSelected && !isEnabled -> MaterialTheme.colorScheme.error.copy(alpha = 0.6f)
        isSelected -> MaterialTheme.colorScheme.primaryContainer
        else -> MaterialTheme.colorScheme.surfaceVariant
    }

    ElevatedCard(
        modifier = modifier
            .clip(RoundedCornerShape(16.dp))
            .fillMaxWidth()
            .border(2.dp, MaterialTheme.colorScheme.onSurface, RoundedCornerShape(16.dp))
            .clickable(enabled = isEnabled, onClick = onClick),
        colors = CardDefaults.elevatedCardColors(
            containerColor = backgroundColor
        )
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = option,
                style = MaterialTheme.typography.titleLarge,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onSurface
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuizResultBottomSheet(
    correctAnswers: Int,
    totalQuestions: Int,
    sheetState: SheetState,
    onDismiss: () -> Unit,
    onRetry: () -> Unit
) {
    val score = (correctAnswers * 100) / totalQuestions
    val resultMessage = when {
        score >= 90 -> "Excellent!"
        score >= 70 -> "Good Job!"
        score >= 50 -> "Keep Practicing!"
        else -> "Try Again!"
    }

    ModalBottomSheet(
        onDismissRequest = onDismiss,
        sheetState = sheetState
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Result icon based on score
            Icon(
                imageVector = when {
                    score >= 90 -> Icons.Default.EmojiEvents
                    score >= 70 -> Icons.Default.Star
                    score >= 50 -> Icons.Default.ThumbUp
                    else -> Icons.Default.Refresh
                },
                contentDescription = null,
                modifier = Modifier.size(64.dp),
                tint = MaterialTheme.colorScheme.primary
            )

            // Result message
            Text(
                text = resultMessage,
                style = MaterialTheme.typography.headlineMedium,
                color = MaterialTheme.colorScheme.onSurface
            )

            // Score
            Text(
                text = "Score: $score%",
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            // Statistics
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = "$correctAnswers",
                        style = MaterialTheme.typography.headlineMedium,
                        color = MaterialTheme.colorScheme.primary
                    )
                    Text(
                        text = "Correct",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = "${totalQuestions - correctAnswers}",
                        style = MaterialTheme.typography.headlineMedium,
                        color = MaterialTheme.colorScheme.error
                    )
                    Text(
                        text = "Wrong",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }

            // Action buttons
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                OutlinedButton(
                    onClick = onDismiss,
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Close")
                }
                Button(
                    onClick = onRetry,
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Try Again")
                }
            }
        }
    }
} 