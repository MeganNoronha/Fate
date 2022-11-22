package com.menaces.fate2

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import android.widget.Toast
import androidx.activity.viewModels
import androidx.fragment.app.commit
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.shadow.ShadowRenderer
import com.menaces.fate2.data.StoryList
import com.menaces.fate2.data.UnexpectedEncounterStory
import com.menaces.fate2.model.Screen
import com.menaces.fate2.model.Story

class MainActivity : AppCompatActivity() {
    private var progressBar: ProgressBar? = null
    lateinit var backBtn: Button
    var currentStory: Story? = null

    private val requestcode = 1
    private val sharedViewModel: SharedViewModel by viewModels{
        SharedViewModelFactory((application as BaseApplication).repository)
    }

    //    val intent = intent
    private val unexpectedEncounterScreens: List<Screen> = UnexpectedEncounterStory.screens
    @SuppressLint("ObjectAnimatorBinding", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // CODE TO GET A STORY BASED ON WHICH LIST ITEM WAS CLICKED
        val intent = intent
        // The default value is for unexpected encounters
        val position = intent.getIntExtra("Story_Number", 0)
        val model = ViewModelProvider(this).get(sharedViewModel::class.java)
        model.setStory(position)
        model.setScreens(position)

        currentStory = StoryList.stories[position]
        // What is the correct context?
//        Toast.makeText(applicationContext, currentStory!!.title, Toast.LENGTH_SHORT).show() // shows which story was pressed
        // END OF CODE
        backBtn = findViewById(R.id.back_button)
        backBtn.setOnClickListener(){
            backButtonPressed()
        }
//        progressBar = findViewById<ProgressBar>(R.id.p_Bar) as ProgressBar
//        progressBar!!.max = 1000
//        var currentProgress = 600
//        //progressBar!!.progress = currentProgress
//        ObjectAnimator.ofInt(progressBar, "progress", currentProgress)
//            .setDuration(2000)
//            .start()

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            val continueFragment = ContinueFragment()
            replace(R.id.fragmentContainer, continueFragment, "con")
        }
    }

    // Goes back to story menu instead of previous fragment
    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, StoryMenuActivity::class.java)
        startActivity(intent)
    }

    fun backButtonPressed(){
        val intent = Intent(this, StoryMenuActivity::class.java)
        startActivity(intent)
    }
}
