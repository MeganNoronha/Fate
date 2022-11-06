package com.menaces.fate2

import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {

    private val storyText: List<String> = listOf("Narration 1", "Narration 2", "Narration 3")

    // variable to contain message whenever it gets changed/modified(mutable)
    val message = MutableLiveData<String>()

    // function to send message
    fun updateNarration(textID: Int) {
        message.value = storyText[textID]
    }
}