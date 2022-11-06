package com.menaces.fate2

import android.graphics.drawable.Drawable
import android.media.Image
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.menaces.fate2.data.UnexpectedEncounterStory
import com.menaces.fate2.model.Screen

class SharedViewModel : ViewModel() {

//    private val unexpectedEncounterText: List<String> = UnexpectedEncounterStory.narration
//    private val unexpectedEncounterImgs: List<Int> = UnexpectedEncounterStory.images

    private val unexpectedEncounterScreens: List<Screen> = UnexpectedEncounterStory.screens

    // variable to contain message whenever it gets changed/modified(mutable)
    val narration = MutableLiveData<String>()
    val image = MutableLiveData<Int>()
    // TODO: add button text? maybe? for choices?? idk

    // function to updated narration and image
    fun updateScreen(ID: Int) {
        narration.value = unexpectedEncounterScreens[ID].narration
        image.value = unexpectedEncounterScreens[ID].imageID
    }
}