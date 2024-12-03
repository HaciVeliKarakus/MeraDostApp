package io.hvk.meradostapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.hvk.meradostapp.model.Quiz
import io.hvk.meradostapp.model.QuizData
import io.hvk.meradostapp.model.quizCategories
import io.hvk.meradostapp.ui.viewmodel.QuizViewModel

@Composable
fun QuizCategoryScreen(
    categoryId: String?,
    quizViewModel: QuizViewModel,
    onBackClick: () -> Unit
) {
    val category = quizCategories.find { it.id == categoryId }
    val quizzes = QuizData.getQuizzesByCategory(categoryId ?: "")
    var currentQuizIndex by remember { mutableIntStateOf(0) }
    var selectedAnswer by remember { mutableStateOf<String?>(null) }
    var showExplanation by remember { mutableStateOf(false) }
    
    LaunchedEffect(currentQuizIndex) {
        if (categoryId != null) {
            quizViewModel.updateProgress(categoryId, currentQuizIndex)
        }
    }
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Header
        Text(
            text = category?.title ?: "Quiz",
            style = MaterialTheme.typography.headlineMedium
        )
        
        Spacer(modifier = Modifier.height(16.dp))
        
        // Progress indicator
        LinearProgressIndicator(
            progress = (currentQuizIndex + 1) / quizzes.size.toFloat(),
            modifier = Modifier.fillMaxWidth()
        )
        
        Spacer(modifier = Modifier.height(24.dp))
        
        // Quiz content
        if (quizzes.isNotEmpty() && currentQuizIndex < quizzes.size) {
            QuizQuestion(
                quiz = quizzes[currentQuizIndex],
                selectedAnswer = selectedAnswer,
                onAnswerSelected = { answer ->
                    selectedAnswer = answer
                    showExplanation = true
                }
            )
            
            Spacer(modifier = Modifier.height(16.dp))
            
            // Explanation
            if (showExplanation && selectedAnswer != null) {
                val isCorrect = selectedAnswer == quizzes[currentQuizIndex].correctAnswer
                ExplanationCard(
                    isCorrect = isCorrect,
                    explanation = quizzes[currentQuizIndex].explanation,
                    onNextClick = {
                        if (currentQuizIndex < quizzes.size - 1) {
                            currentQuizIndex++
                            selectedAnswer = null
                            showExplanation = false
                        } else {
                            // Quiz completed
                            onBackClick()
                        }
                    }
                )
            }
        }
    }
}

@Composable
fun QuizQuestion(
    quiz: Quiz,
    selectedAnswer: String?,
    onAnswerSelected: (String) -> Unit
) {
    Column {
        Text(
            text = quiz.question,
            style = MaterialTheme.typography.titleLarge
        )
        
        Spacer(modifier = Modifier.height(16.dp))
        
        quiz.options.forEach { option ->
            val isSelected = option == selectedAnswer
            ElevatedButton(
                onClick = { onAnswerSelected(option) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp),
                colors = ButtonDefaults.elevatedButtonColors(
                    containerColor = if (isSelected) 
                        MaterialTheme.colorScheme.primaryContainer 
                    else 
                        MaterialTheme.colorScheme.surface
                )
            ) {
                Text(
                    text = option,
                    color = if (isSelected) 
                        MaterialTheme.colorScheme.onPrimaryContainer 
                    else 
                        MaterialTheme.colorScheme.onSurface
                )
            }
        }
    }
}

@Composable
fun ExplanationCard(
    isCorrect: Boolean,
    explanation: String?,
    onNextClick: () -> Unit
) {
    ElevatedCard(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.elevatedCardColors(
            containerColor = if (isCorrect) 
                MaterialTheme.colorScheme.primaryContainer 
            else 
                MaterialTheme.colorScheme.errorContainer
        )
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = if (isCorrect) "Correct!" else "Incorrect",
                style = MaterialTheme.typography.titleMedium
            )
            
            if (explanation != null) {
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = explanation,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
            
            Spacer(modifier = Modifier.height(16.dp))
            
            Button(
                onClick = onNextClick,
                modifier = Modifier.align(Alignment.End)
            ) {
                Text(text = "Next")
            }
        }
    }
} 