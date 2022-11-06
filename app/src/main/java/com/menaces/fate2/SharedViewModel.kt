package com.menaces.fate2

import android.graphics.drawable.Drawable
import android.media.Image
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.menaces.fate2.data.UnexpectedEncounterStory

class SharedViewModel : ViewModel() {

//    private val storyText: List<String> = listOf("Narration 1", "Narration 2", "Narration 3")
    private val unexpectedEncounterText: List<String> = UnexpectedEncounterStory.narration

//    private val storyImages: List<Int> = listOf(R.drawable.trees_story, R.drawable.unexpected_encounter_image)

    // variable to contain message whenever it gets changed/modified(mutable)
    val message = MutableLiveData<String>()
//    val image = MutableLiveData<Image>()

    // function to updated narration
    fun updateNarration(textID: Int) {
        message.value = unexpectedEncounterText[textID]
    }

    // function to update image
    fun updateImage(imageID: Int) {
//        image.value =
//        storyImages[imageID]
    }
}