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
import com.menaces.fate2.data.StoryList
import com.menaces.fate2.data.UnexpectedEncounterStory
import com.menaces.fate2.model.Screen
import com.menaces.fate2.model.Story

class SharedViewModel : ViewModel() {

    private var screens: List<Screen> = setScreens(0)
    private var counter = 0 // TODO: get from database

    // variable to contain message whenever it gets changed/modified(mutable)
    val narration = MutableLiveData<String>()
    val image = MutableLiveData<Int>()
    val leftText = MutableLiveData<String>()
    val rightText = MutableLiveData<String>()
    val contButton = MutableLiveData<String>()

    // gets right screen from passed position from the list
    fun setScreens(position: Int) : List<Screen> {
        screens = StoryList.stories[position].screens
        return screens
    }

    // function to updated narration and image, returns new counter value??
    fun updateScreen() {
        // check that story is not at the end screen
        narration.value = screens[counter].narration
        image.value = screens[counter].imageID
        leftText.value = screens[counter].leftButton
        rightText.value = screens[counter].rightButton
        contButton.value = screens[counter].leftButton

        Log.d("COUNTER: ", counter.toString())
    }

    // Increments and returns counter
    fun incrementCounter(increment: Int) : Int {
        counter += increment
        return counter
    }

    // returns true if current counter points to a choice buttons screen
    fun isChoiceScreen() : Boolean {
        return screens[counter].isChoice
    }

    // returns true if the current counter points to an end screen
    fun isEndScreen() : Boolean {
        return counter == 16 ||
                counter == 17 ||
                counter == 33 ||
                counter == 47 ||
                counter == 50 ||
                counter == 55 ||
                counter == 62 ||
                counter == 66
    }

    // returns increment value based on left/right
    fun getIncrementVal(leftClicked : Boolean) : Int {
        if (leftClicked) {
            return screens[counter].leftValue
        } else {
            return screens[counter].rightValue
        }
    }

    // return counter
    fun getCounter() : Int {
        return counter
    }
}