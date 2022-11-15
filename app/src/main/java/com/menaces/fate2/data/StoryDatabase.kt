package com.menaces.fate2.data

import android.content.Context
import androidx.room.Database
import androidx.room.RoomDatabase
import com.menaces.fate2.model.Story
import com.menaces.fate2.model.StoryData
import kotlinx.coroutines.CoroutineScope

@Database(entities = [StoryData::class], version = 1, exportSchema = false)
public abstract class StoryDatabase: RoomDatabase() {
    abstract fun storyDao(): StoryDao

    companion object{
        @Volatile
        private var INSTANCE: StoryDatabase? = null

        fun getDatabase(context: Context,
                        scope: CoroutineScope
        ): StoryDatabase{
            return INSTANCE ?: synchronized(this){
                val instance = androidx.room.Room.databaseBuilder(
                    context.applicationContext,
                    StoryDatabase::class.java,
                    "word_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}