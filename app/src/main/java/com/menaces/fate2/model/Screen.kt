package com.menaces.fate2.model

data class Screen(
    val narration: String,
    val imageID: Int,
    val button1: String,
    val button2: String,
    val isChoice: Boolean
)