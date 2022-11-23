package com.menaces.fate2

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.menaces.fate2.data.StoryList
import com.menaces.fate2.model.Screen
import com.menaces.fate2.model.Story
import androidx.lifecycle.*
import com.menaces.fate2.data.StoryRepository
import com.menaces.fate2.model.StoryData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import com.menaces.fate2.data.StoryDao

class SharedViewModel(private val repository: StoryRepository) : ViewModel() {

    private var currentStory: Story = setStory(0)
    private var screens: List<Screen> = currentStory.screens
    private var counter = 0 // count()

    fun insert(storyData: StoryData) = viewModelScope.launch {
        repository.insert(storyData)
    }

    fun getCounter(): LiveData<StoryData> {
        return repository.getCounter(currentStory.title)
    }

    fun count(): Int {
        if (getCounter().value == null) {
            return 0
        } else {
            return getCounter().value!!.counter
        }
    }

    fun updateCounter(storyData: StoryData) {
        storyData.counter = counter
        viewModelScope.launch(Dispatchers.IO) {
            repository.insert(storyData)
        }
    }

    fun setScreens(position: Int): List<Screen> {
        screens = StoryList.stories[position].screens
        return screens
    }

    // variable to contain message whenever it gets changed/modified(mutable)
    val narration = MutableLiveData<String>()
    val image = MutableLiveData<Int>()
    val leftText = MutableLiveData<String>()
    val rightText = MutableLiveData<String>()
    val contButton = MutableLiveData<String>()
    val imageDesc = MutableLiveData<String>()

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
        imageDesc.value = "example content description" // TODO: screens[counter].contentDesc
    }

    // Increments and returns counter
    fun incrementCounter(increment: Int): Int {
        counter += increment
        val storyData = StoryData(currentStory.title, counter)
        updateCounter(storyData)
        insert(storyData)
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
}


class SharedViewModelFactory(private val repository: StoryRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom((SharedViewModel::class.java))) {
            return SharedViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}

