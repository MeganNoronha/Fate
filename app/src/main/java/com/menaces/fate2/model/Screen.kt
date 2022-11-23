package com.menaces.fate2.model

data class Screen(
    val narration: String,
    val imageID: Int,
    val leftButton: String,
    val rightButton: String,
    val leftValue: Int,
    val rightValue: Int,
    val isChoice: Boolean,
    val isEnding: Boolean
)