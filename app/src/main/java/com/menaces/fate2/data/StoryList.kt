package com.menaces.fate2.data

import com.menaces.fate2.R
import com.menaces.fate2.model.Story

object StoryList {
    val stories: List<Story> = listOf(
        Story(
            R.drawable.unexpected_encounter_image,
            "An Unexpected Encounter",
            "Romance",
            "You meet the love of your life one way or other",
            UnexpectedEncounterStory.screens,
            0,
            0
        ),
        Story(
            R.drawable.trees_story,
            "A Sunday Morning",
            "Sci-Fi, Horror",
            "It’s just your regular Sunday morning hike through the woods. Nothing can go wrong, right?",
            TreesStory.screens,
            0,
            0
        )
    )
}