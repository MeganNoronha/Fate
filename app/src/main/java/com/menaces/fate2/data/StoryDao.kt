package com.menaces.fate2.data

import android.provider.ContactsContract
import androidx.room.*
import com.menaces.fate2.model.StoryData
import kotlinx.coroutines.flow.Flow

/**
 * Data Access Object for database interaction.
 */
@Dao
interface StoryDao {
    // TODO: implement a method to retrieve a Forageable from the database by id
    @Query("SELECT counter from story_database WHERE title= :title")
    fun getCounter(title: String): Int

    //@Query("UPDATE story_database SET counter= WHERE title= :title")

    @Update
    suspend fun updateStory(storydata: StoryData)

}