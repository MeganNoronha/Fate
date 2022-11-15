package com.menaces.fate2

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.menaces.fate2.data.StoryList
import com.menaces.fate2.model.Screen
import com.menaces.fate2.model.Story
import androidx.lifecycle.*
import androidx.room.ColumnInfo
import com.menaces.fate2.data.StoryDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SharedViewModel(private val storydao: StoryDao) : ViewModel() {


    private var currentStory: Story = setStory(0)
    private var screens: List<Screen> = currentStory.screens
    private var counter = 0 // TODO: get from database
//  private var counter = getCounter()

    fun getCounter(): Int {
        return storydao.getCounter(currentStory.title)
    }

//    fun updateCounter(counter: Int) {
//        val story = StoryData(
//            title = currentStory.title,
//            counter = counter
//        )
//
//        viewModelScope.launch(Dispatchers.IO) {
//            // TODO: call the DAO method to update a forageable to the database here
//            storydao.updateStory(story)
//        }
//
//    }


    // variable to contain message whenever it gets changed/modified(mutable)
    val narration = MutableLiveData<String>()
    val image = MutableLiveData<Int>()
    val leftText = MutableLiveData<String>()
    val rightText = MutableLiveData<String>()
    val contButton = MutableLiveData<String>()

    // gets right screen from passed position from the list
    fun setStory(position: Int): Story {
        currentStory = StoryList.stories[position]
        return currentStory
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
    fun incrementCounter(increment: Int): Int {
        counter += increment
//        updateCounter(counter)
        return counter
    }

    // returns true if current counter points to a choice buttons screen
    fun isChoiceScreen(): Boolean {
        return screens[counter].isChoice
    }

    // returns true if the current counter points to an end screen
    fun isEndScreen(): Boolean {
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
    fun getIncrementVal(leftClicked: Boolean): Int {
        if (leftClicked) {
            return screens[counter].leftValue
        } else {
            return screens[counter].rightValue
        }
    }

    // return counter
//    fun getCounter() : Int {
//        return counter
//    }
}