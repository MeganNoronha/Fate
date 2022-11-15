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
            0
        ),
        Story(
            R.drawable.trees_story,
            "Trees: Friends or Foes",
            "Sci-Fi",
            "Strange things keep happening to you - who, or what, is behind it?",
            TreesStory.screens,
            0
        )
    )
}