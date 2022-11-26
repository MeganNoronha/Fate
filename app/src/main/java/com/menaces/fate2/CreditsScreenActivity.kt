package com.menaces.fate2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CreditsScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_credits_screen)
        actionBar?.setDisplayHomeAsUpEnabled(true);
    }
}