package com.menaces.fate2

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ProgressBar
import android.widget.TextView
import androidx.fragment.app.commit
import com.menaces.fate2.data.UnexpectedEncounterStory
import com.menaces.fate2.model.Screen

class MainActivity : AppCompatActivity() {
    private var progressBar: ProgressBar? = null
    private val unexpectedEncounterScreens: List<Screen> = UnexpectedEncounterStory.screens
    @SuppressLint("ObjectAnimatorBinding")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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