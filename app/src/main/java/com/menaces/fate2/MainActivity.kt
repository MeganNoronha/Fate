package com.menaces.fate2

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.commit
import androidx.lifecycle.ViewModelProvider
import com.menaces.fate2.data.StoryList
import com.menaces.fate2.data.UnexpectedEncounterStory
import com.menaces.fate2.model.Screen
import com.menaces.fate2.model.Story

class MainActivity : AppCompatActivity() {
    private var progressBar: ProgressBar? = null
    var currentStory: Story? = null

//    val intent = intent
    private val unexpectedEncounterScreens: List<Screen> = UnexpectedEncounterStory.screens
    @SuppressLint("ObjectAnimatorBinding")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // CODE TO GET A STORY BASED ON WHICH LIST ITEM WAS CLICKED
        val intent = intent
        // The default value is for unexpected encounters
        val position = intent.getIntExtra("Story_Number", 0)
        val model = ViewModelProvider(this).get(SharedViewModel::class.java)
        model.setScreens(position)

        currentStory = StoryList.stories[position]
        // What is the correct context?
        Toast.makeText(applicationContext, currentStory!!.title, Toast.LENGTH_SHORT).show()
        // END OF CODE

        progressBar = findViewById<ProgressBar>(R.id.p_Bar) as ProgressBar
        progressBar!!.max = 1000
        var currentProgress = 600
        //progressBar!!.progress = currentProgress
        ObjectAnimator.ofInt(progressBar, "progress", currentProgress)
            .setDuration(2000)
            .start()

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            val continueFragment = ContinueFragment()
            replace(R.id.fragmentContainer, continueFragment, "con")
        }
    }
}