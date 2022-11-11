package com.menaces.fate2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StartActivity : AppCompatActivity() {
    private lateinit var storyIntent: Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        // start button
        val startButton: Button = findViewById(R.id.start_button)
        startButton.setOnClickListener {
            launchStoryMenu()
        }

        // instructions button
        val instructionsButton: Button = findViewById(R.id.instructions_button)
        instructionsButton.setOnClickListener {
            launchInstructions()
        }

    }

    private fun launchStoryMenu() {
        storyIntent = Intent(this, StoryMenuActivity::class.java)
        startActivity(storyIntent)
    }

    private fun launchInstructions() {
        storyIntent = Intent(this, InstructionsActivity::class.java)
        startActivity(storyIntent)
    }
}