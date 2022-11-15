package com.menaces.fate2.model

import androidx.annotation.DrawableRes
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

data class Story(
    @DrawableRes val imageResourceId: Int,
    val title: String,
    val genre: String,
    val desc: String,
    val screens: List<Screen>,
    val completionPercent: Int,
    var counter: Int
)