package com.menaces.fate2

import android.app.Application
import com.google.android.material.color.DynamicColors
import com.menaces.fate2.data.StoryDatabase
import com.menaces.fate2.data.StoryRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class BaseApplication: Application(){

    val applicationScope = CoroutineScope(SupervisorJob())
    val database by lazy {StoryDatabase.getDatabase(this, applicationScope)}
    val repository by lazy {StoryRepository(database.storyDao())}

    override fun onCreate() {
        super.onCreate()
        // Apply dynamic color
        DynamicColors.applyToActivitiesIfAvailable(this, R.style.Theme_Fate2_Overlay)
        
    }
}
