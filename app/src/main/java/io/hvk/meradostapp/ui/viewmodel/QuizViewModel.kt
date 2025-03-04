package io.hvk.meradostapp.ui.viewmodel

import android.app.Application
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import io.hvk.meradostapp.data.db.AppDatabase
import io.hvk.meradostapp.data.db.QuizProgress
import io.hvk.meradostapp.model.QuizData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

class QuizViewModel(application: Application) : AndroidViewModel(application) {
    private val database = AppDatabase.getDatabase(application)
    private val quizProgressDao = database.quizProgressDao()

    val allProgress: Flow<List<QuizProgress>> = quizProgressDao.getAllProgress()

    fun updateProgress(categoryId: String, completedQuizzes: Int) {
        viewModelScope.launch {
            val totalQuizzes = QuizData.getQuizzesByCategory(categoryId).size
            val progress = QuizProgress(
                categoryId = categoryId,
                completedQuizzes = completedQuizzes,
                totalQuizzes = totalQuizzes
            )
            quizProgressDao.updateProgress(progress)
        }
    }

    fun clearAllProgress() {
        viewModelScope.launch {
            quizProgressDao.clearAllProgress()
        }
    }

    fun getProgressForCategory(categoryId: String) = flow {
        // Get progress from database
        val progress = quizProgressDao.getProgressForCategory(categoryId)
        emit(progress ?: QuizProgress(categoryId = categoryId, completedQuizzes = 0, totalQuizzes = 0))
    }

    @Composable
    fun getCategoryProgress(categoryId: String): Float {
        val progress by getProgressForCategory(categoryId)
            .collectAsState(initial = QuizProgress(categoryId = categoryId, completedQuizzes = 0, totalQuizzes = 0))
        
        return if (progress.totalQuizzes > 0) {
            progress.completedQuizzes.toFloat() / progress.totalQuizzes
        } else {
            0f
        }
    }

    fun updateQuizAttempt(categoryId: String, completedQuizzes: Int, score: Int) {
        viewModelScope.launch {
            val totalQuizzes = QuizData.getQuizzesByCategory(categoryId).size
            val progress = QuizProgress(
                categoryId = categoryId,
                completedQuizzes = completedQuizzes,
                totalQuizzes = totalQuizzes,
                lastAttemptDate = System.currentTimeMillis(),
                highestScore = score
            )
            quizProgressDao.updateProgress(progress)
            quizProgressDao.updateHighScore(categoryId, score)
            quizProgressDao.incrementAttempts(categoryId)
        }
    }

    fun getHighScore(categoryId: String) = flow {
        val progress = quizProgressDao.getProgressForCategory(categoryId)
        emit(progress?.highestScore ?: 0)
    }

    fun getTotalAttempts(categoryId: String) = flow {
        val progress = quizProgressDao.getProgressForCategory(categoryId)
        emit(progress?.totalAttempts ?: 0)
    }
} 