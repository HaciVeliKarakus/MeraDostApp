package io.hvk.meradostapp.data.db

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface QuizProgressDao {
    @Query("SELECT * FROM quiz_progress")
    fun getAllProgress(): Flow<List<QuizProgress>>

    @Query("SELECT * FROM quiz_progress WHERE categoryId = :categoryId")
    suspend fun getProgressForCategory(categoryId: String): QuizProgress?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateProgress(progress: QuizProgress)

    @Query("DELETE FROM quiz_progress")
    suspend fun clearAllProgress()

    @Query("UPDATE quiz_progress SET highestScore = :score WHERE categoryId = :categoryId AND highestScore < :score")
    suspend fun updateHighScore(categoryId: String, score: Int)

    @Query("UPDATE quiz_progress SET totalAttempts = totalAttempts + 1 WHERE categoryId = :categoryId")
    suspend fun incrementAttempts(categoryId: String)
} 