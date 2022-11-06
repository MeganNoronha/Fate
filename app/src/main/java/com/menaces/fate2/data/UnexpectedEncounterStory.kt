package com.menaces.fate2.data

import android.media.Image
import com.menaces.fate2.R
import com.menaces.fate2.model.Screen

object UnexpectedEncounterStory {
    // Narration strings for each screen of the story
//    val narration: List<String> = listOf("Narration 1", "Narration 2", "Narration 3")

    // Images for each screen of the story
//    val images: List<Int> = listOf(R.drawable.trees_story, R.drawable.unexpected_encounter_image, R.drawable.bittern)

    val screens: List<Screen> = listOf(
        Screen(
            "Narration 1",
            R.drawable.trees_story,
            "Left",
            "Right",
            true
        )
    )
}