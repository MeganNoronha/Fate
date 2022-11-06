package com.menaces.fate2

import android.graphics.drawable.Drawable
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.menaces.fate2.data.UnexpectedEncounterStory

class SharedViewModel : ViewModel() {

//    private val storyText: List<String> = listOf("Narration 1", "Narration 2", "Narration 3")
//    private val storyImages: List<Int> = listOf(R.drawable.trees_story, R.drawable.unexpected_encounter_image)

    private val unexpectedEncounterText: List<String> = UnexpectedEncounterStory.narration


    // variable to contain message whenever it gets changed/modified(mutable)
    val message = MutableLiveData<String>()
    val image = MutableLiveData<Int>()

    // function to updated narration and image
    fun updateScreen(ID: Int) {
        message.value = unexpectedEncounterText[ID]
        image.value = R.drawable.trees_story
    }
}