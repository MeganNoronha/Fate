package com.menaces.fate2

import android.app.Application
import com.menaces.fate2.data.StoryDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class BaseApplication: Application(){

    val applicationScope = CoroutineScope(SupervisorJob())
    val database by lazy {StoryDatabase.getDatabase(this, applicationScope)}
}