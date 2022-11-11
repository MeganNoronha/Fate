package com.menaces.fate2

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AccelerateInterpolator
import android.view.animation.LinearInterpolator
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.animation.doOnEnd
import androidx.core.animation.doOnStart
import kotlin.math.ceil

class CoinFlipActivity : AppCompatActivity() {
    private lateinit var layout: ConstraintLayout
    private lateinit var coinText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coin_flip)
        layout = findViewById(R.id.coinActivity)
        coinText = findViewById(R.id.coin_text_view)
        layout.setOnTouchListener(object : OnSwipeTouchListener(this@CoinFlipActivity) {
            override fun onSwipeUp(
                velocityX: Float,
            ) {
                super.onSwipeUp(velocityX)

                flip(velocityX)

            }
        })

    }


    private fun flip(velocityX: Float) {

//        var height: Float = Math.abs(velocityX/2)
        var height: Float = 500f
//        var rotations: Float = ceil(Math.abs(velocityX/500).toDouble()).toFloat()
        var rotations: Float = 720f
//        Toast.makeText(this@CoinFlipActivity, "rotations $rotations", Toast.LENGTH_SHORT)
//            .show()
        var time = 1000
        var coin = findViewById<ImageView>(R.id.coin_image_view)


        val mover = ObjectAnimator.ofFloat(
            coin, View.TRANSLATION_Y,
            -height
        )
        mover.repeatCount = 1
        mover.repeatMode = ObjectAnimator.REVERSE
        mover.interpolator = AccelerateInterpolator(1f)
        val rotator = ObjectAnimator.ofFloat(
            coin, View.ROTATION_X,
            (rotations).toFloat()
        )
        rotator.repeatCount = 1
        rotator.repeatMode = ObjectAnimator.REVERSE
        rotator.interpolator = LinearInterpolator()

        val set = AnimatorSet()
        set.playTogether(mover, rotator)
        set.duration = (time).toLong()

        set.doOnStart {
            coinText.visibility = View.GONE
        }
        set.start()

        set.doOnEnd {
            coinOutput()

        }

    }

    private fun coinOutput() {
        val randomNumber = (1..50).random()
        val choice = if (randomNumber % 2 == 1) {
            "TOP"
        } else {
            "BOTTOM"
        }
        coinText.text = choice
        coinText.visibility = View.VISIBLE
    }
}


