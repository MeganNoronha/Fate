package com.menaces.fate2

import android.graphics.drawable.Drawable
import android.media.Image
import android.widget.Toast
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.menaces.fate2.data.UnexpectedEncounterStory
import com.menaces.fate2.model.Screen

class SharedViewModel : ViewModel() {

    private val unexpectedEncounterScreens: List<Screen> = UnexpectedEncounterStory.screens

    // variable to contain message whenever it gets changed/modified(mutable)
    val narration = MutableLiveData<String>()
    val image = MutableLiveData<Int>()

    var counter = 0

    // function to updated narration and image
    fun updateScreen(ID: Int) {
        narration.value = unexpectedEncounterScreens[ID].narration
        image.value = unexpectedEncounterScreens[ID].imageID
        counter += 1
    }

    fun nextScreenIsChoice () : Boolean {
        return unexpectedEncounterScreens[counter].isChoice
    }
}