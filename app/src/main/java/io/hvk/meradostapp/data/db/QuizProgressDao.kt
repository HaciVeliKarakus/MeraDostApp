package io.hvk.meradostapp.data.db

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface QuizProgressDao {
    @Query("SELECT * FROM quiz_progress")
    fun getAllProgress(): Flow<List<QuizProgress>>

    @Query("SELECT * FROM quiz_progress WHERE categoryId = :categoryId")
    fun getProgressForCategory(categoryId: String): Flow<QuizProgress?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateProgress(progress: QuizProgress)

    @Query("DELETE FROM quiz_progress")
    suspend fun clearAllProgress()
} 