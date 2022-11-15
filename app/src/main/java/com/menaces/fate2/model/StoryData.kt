package com.menaces.fate2.model

import androidx.annotation.DrawableRes
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="story_database")
data class StoryData(
    @PrimaryKey(autoGenerate = false) val title: String,
    @ColumnInfo(name = "counter") var counter: Int
)