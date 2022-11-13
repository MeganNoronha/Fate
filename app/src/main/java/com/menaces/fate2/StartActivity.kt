package com.menaces.fate2

import android.annotation.SuppressLint
import android.content.Intent
import android.media.AudioManager
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import java.io.IOException

class StartActivity : AppCompatActivity() {
    private lateinit var storyIntent: Intent
    private lateinit var btnPlay: Button
    private lateinit var btnPause: Button
    //var mediaPlayer: MediaPlayer? = null
    var isPlaying: Boolean = false
    @SuppressLint("MissingInflatedId")
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

        val mediaPlayer: MediaPlayer = MediaPlayer.create(this, R.raw.house_lo)

        // play_music button
        btnPlay = findViewById(R.id.play_music_button)
        btnPlay.setOnClickListener {
            if (!mediaPlayer.isPlaying) {
                mediaPlayer.start()
            } else {
                mediaPlayer.pause()
            }
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