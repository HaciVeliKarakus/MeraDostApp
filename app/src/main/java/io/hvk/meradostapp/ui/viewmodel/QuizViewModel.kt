package io.hvk.meradostapp.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import io.hvk.meradostapp.data.db.AppDatabase
import io.hvk.meradostapp.data.db.QuizProgress
import io.hvk.meradostapp.model.QuizData
import kotlinx.coroutines.flow.Flow
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

    fun getProgressForCategory(categoryId: String): Flow<QuizProgress?> {
        return quizProgressDao.getProgressForCategory(categoryId)
    }
} 