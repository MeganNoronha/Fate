package com.menaces.fate2

import android.graphics.drawable.Drawable
import android.media.Image
import android.os.Build.ID
import android.text.TextUtils.replace
import android.util.Log
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import androidx.fragment.app.commit
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.menaces.fate2.data.UnexpectedEncounterStory
import com.menaces.fate2.model.Screen

class SharedViewModel : ViewModel() {

    private val unexpectedEncounterScreens: List<Screen> = UnexpectedEncounterStory.screens
    private var counter = 0

    // variable to contain message whenever it gets changed/modified(mutable)
    val narration = MutableLiveData<String>()
    val image = MutableLiveData<Int>()
    val leftText = MutableLiveData<String>()
    val rightText =MutableLiveData<String>()

    // function to updated narration and image, returns new counter value??
    fun updateScreen() { //increment: Int
        // check that story is not at the end screen
//        if (counter < unexpectedEncounterScreens.size) {
            narration.value = unexpectedEncounterScreens[counter].narration
            image.value = unexpectedEncounterScreens[counter].imageID
            leftText.value = unexpectedEncounterScreens[counter].leftButton
            rightText.value = unexpectedEncounterScreens[counter].rightButton
//            counter += increment
//        }

//        return counter
    }

    fun incrementCounter(increment: Int) {
        counter += increment
    }

    fun isChoiceScreen() : Boolean {
        return unexpectedEncounterScreens[counter].isChoice
    }

    // returns increment value based on left/right
    fun getIncrementVal(leftClicked : Boolean) : Int {
        if (leftClicked) {
            return unexpectedEncounterScreens[counter].leftValue
        } else {
            return unexpectedEncounterScreens[counter].leftValue
        }
    }

    fun returnCurrentScreen() : Screen {
        return unexpectedEncounterScreens[counter]
    }

    fun returnCounter() : Int {
        return counter
    }
}