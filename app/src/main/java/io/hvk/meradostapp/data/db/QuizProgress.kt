package io.hvk.meradostapp.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "quiz_progress")
data class QuizProgress(
    @PrimaryKey
    val categoryId: String,
    val completedQuizzes: Int,
    val totalQuizzes: Int,
    val lastUpdated: Long = System.currentTimeMillis()
) 