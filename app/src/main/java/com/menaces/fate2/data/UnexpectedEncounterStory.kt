package com.menaces.fate2.data

import android.media.Image
import com.menaces.fate2.R
import com.menaces.fate2.model.Screen

object UnexpectedEncounterStory {
    val screens: List<Screen> = listOf(
        Screen(
            "Narration 1",
            R.drawable.trees_story,
            "Left",
            "Right",
            true
        ),
        Screen(
            "Narration 2",
            R.drawable.unexpected_encounter_image,
            "Left",
            "Right",
            true
        ),
        Screen(
            "Narration 3",
            R.drawable.bittern,
            "Left",
            "Right",
            true
        )
    )
}