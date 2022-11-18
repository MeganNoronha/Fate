package com.menaces.fate2.data

import android.content.Context
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.menaces.fate2.model.Story
import com.menaces.fate2.model.StoryData
import com.menaces.fate2.data.StoryDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

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
                    "story_database"
                ).fallbackToDestructiveMigration()
                    .addCallback(StoryDatabaseCallback(scope)).build()
                INSTANCE = instance
                instance
            }
        }
    }
    private class StoryDatabaseCallback(
        private val scope: CoroutineScope) : RoomDatabase.Callback(){
        override fun onCreate(db: SupportSQLiteDatabase) {
            super.onCreate(db)
            INSTANCE?.let{ database ->
                scope.launch(Dispatchers.IO){
                    populateDatabase(database.storyDao())
                }
            }
        }

        suspend fun populateDatabase(storydao: StoryDao){
            //storydao.deleteAll()
            var story = StoryData("Unexpected Encounter", 0)
            storydao.insert(story)
        }
    }
}

