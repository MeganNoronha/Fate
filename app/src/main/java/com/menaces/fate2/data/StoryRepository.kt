package com.menaces.fate2.data

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import androidx.lifecycle.asLiveData
import com.menaces.fate2.model.StoryData
import kotlinx.coroutines.flow.Flow

class StoryRepository(private val storyDao: StoryDao) {


    @WorkerThread
    suspend fun insert(storyData: StoryData){
        storyDao.insert(storyData)
    }

    @WorkerThread
    fun getCounter(title: String): LiveData<StoryData> {
        return storyDao.getCounter(title).asLiveData()
    }



}
