package com.menaces.fate2

import android.annotation.SuppressLint
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Intent
import android.media.AudioManager
import android.media.MediaPlayer
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import com.menaces.fate2.notifications.RemindersManager
import java.io.IOException

class StartActivity : AppCompatActivity() {
    private lateinit var storyIntent: Intent
    private lateinit var btnPlay: Button
    private lateinit var btnPause: Button
    //var mediaPlayer: MediaPlayer? = null
    var isPlaying: Boolean = false
    @RequiresApi(Build.VERSION_CODES.M)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        // set up notifications // TODO: this is where it crashes
        createNotificationsChannels()
        RemindersManager.startReminder(this)

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

        val mediaPlayer: MediaPlayer = MediaPlayer.create(this, R.raw.battle_theme)

        // play_music button
        btnPlay = findViewById(R.id.play_music_button)
        btnPlay.setOnClickListener {
            if (!mediaPlayer.isPlaying) {
                mediaPlayer.isLooping = true
                mediaPlayer.start()
                btnPlay.setText(R.string.stop)
            } else {
                mediaPlayer.pause()
                btnPlay.setText(R.string.play)
            }
        }
    }

    // Set up notifications
    private fun createNotificationsChannels() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                getString(R.string.reminders_notification_channel_id),
                getString(R.string.reminders_notification_channel_name),
                NotificationManager.IMPORTANCE_HIGH
            )
            ContextCompat.getSystemService(this, NotificationManager::class.java)
                ?.createNotificationChannel(channel)
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