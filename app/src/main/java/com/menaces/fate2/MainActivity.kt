package com.menaces.fate2

import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import android.widget.Switch
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private var progressBar: ProgressBar? = null
    lateinit var backBtn: Button
    lateinit var musicSwitch: Switch
    lateinit var mediaPlayer: MediaPlayer

    private val sharedViewModel: SharedViewModel by viewModels{
        SharedViewModelFactory((application as BaseApplication).repository)
    }

    @SuppressLint("ObjectAnimatorBinding", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // goes to story clicked on the list
        val intent = intent
        val position = intent.getIntExtra("Story_Number", 0) // default unexpected encounters

        // sets the right story/screens in the shared view model
        val model = ViewModelProvider(this).get(sharedViewModel::class.java)
        model.setStory(position)
        model.setScreens(position)

        // configures action bar back button to go to the previous activity
        backBtn = findViewById(R.id.back_button)
        backBtn.setOnClickListener(){
            backButtonPressed()
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.jazz_music)

        musicSwitch = findViewById(R.id.music_switch)
        musicSwitch.setOnCheckedChangeListener{buttonView, isChecked ->
            if(isChecked){
                Toast.makeText(this@MainActivity, "Music Playing", Toast.LENGTH_SHORT).show()
                if (!mediaPlayer.isPlaying) {
                    mediaPlayer.isLooping = true
                    mediaPlayer.start()
                }
            } else{
                Toast.makeText(this@MainActivity, "Music Stopped", Toast.LENGTH_SHORT).show()
                    mediaPlayer.pause()
            }

        }

        // loads the continue button fragment
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            val continueFragment = ContinueFragment()
            replace(R.id.fragmentContainer, continueFragment, "con")
        }
    }

    override fun onStop() {
        super.onStop()
        mediaPlayer.pause()
        musicSwitch.isChecked = false
    }


    // Goes back to story menu instead of previous fragment (device button)
    override fun onBackPressed() {
        backButtonPressed()
    }

    fun backButtonPressed(){
        val intent = Intent(this, StoryMenuActivity::class.java)
        startActivity(intent)
    }
}
