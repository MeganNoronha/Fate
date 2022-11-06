package com.menaces.fate2

import android.graphics.drawable.Drawable
import android.media.Image
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.menaces.fate2.data.UnexpectedEncounterStory

class SharedViewModel : ViewModel() {

    private val unexpectedEncounterText: List<String> = UnexpectedEncounterStory.narration
    private val unexpectedEncounterImgs: List<Int> = UnexpectedEncounterStory.images

    // variable to contain message whenever it gets changed/modified(mutable)
    val message = MutableLiveData<String>()
    val image = MutableLiveData<Int>()

    // function to updated narration and image
    fun updateScreen(ID: Int) {
        message.value = unexpectedEncounterText[ID]
        image.value = unexpectedEncounterImgs[ID]
    }
}