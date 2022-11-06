package com.menaces.fate2.model

import androidx.annotation.DrawableRes

data class Story(
    @DrawableRes val imageResourceId: Int,
    val title: String,
    val genre: String,
    val desc: String,
    val completionPercent: Int
)