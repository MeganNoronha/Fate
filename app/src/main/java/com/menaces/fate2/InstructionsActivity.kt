package com.menaces.fate2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class InstructionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instructions)

        val coinButton : Button = findViewById(R.id.instructions_coin)
        coinButton.setOnClickListener {
            launchCoinFlipActivity()
        }
    }

    private fun launchCoinFlipActivity() {
        var intent = Intent(this, CoinFlipActivity::class.java)
        startActivity(intent)
    }
}