package io.hvk.meradostapp.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "quiz_progress")
data class QuizProgress(
    @PrimaryKey
    val categoryId: String,
    val completedQuizzes: Int,
    val totalQuizzes: Int,
    val lastAttemptDate: Long = System.currentTimeMillis(),
    val highestScore: Int = 0,
    val totalAttempts: Int = 0
) 