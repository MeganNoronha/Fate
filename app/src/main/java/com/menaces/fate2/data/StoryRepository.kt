package com.menaces.fate2.data

import androidx.annotation.WorkerThread
import com.menaces.fate2.model.StoryData
import kotlinx.coroutines.flow.Flow

class StoryRepository(private val storyDao: StoryDao) {

    @WorkerThread
    suspend fun insert(storyData: StoryData){
        storyDao.insert(storyData)
    }
}
