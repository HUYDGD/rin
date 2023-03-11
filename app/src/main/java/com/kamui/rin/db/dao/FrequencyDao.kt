package com.kamui.rin.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.kamui.rin.db.model.Frequency
import com.kamui.rin.db.model.Tag

@Dao
interface FrequencyDao {
    @Query("DELETE FROM Frequency")
    fun clear()

    @Insert
    fun insertFrequencies(freq: List<Frequency>)

    @Query("SELECT frequency FROM Frequency WHERE kanji = :kanji")
    fun getFrequencyForWord(kanji: String): Long?
}