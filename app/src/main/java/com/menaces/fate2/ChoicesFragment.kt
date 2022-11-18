package com.menaces.fate2

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.commit
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ChoicesFragment : Fragment() {

    lateinit var leftBtn: Button
    lateinit var rightBtn: Button
    lateinit var coinBtn: FloatingActionButton

    // shared view model with repository
    private val sharedViewModel: SharedViewModel by viewModels{
        SharedViewModelFactory((activity?.application as BaseApplication).repository)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_choices, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // references for buttons
        leftBtn = view.findViewById(R.id.left_button)
        rightBtn = view.findViewById(R.id.right_button)
        coinBtn= view.findViewById(R.id.coin_fab)

        // update button text
        updateButtonText()

        val model = ViewModelProvider(requireActivity())[sharedViewModel::class.java]

        // left button
        leftBtn.setOnClickListener {
            val inc = model.getIncrementVal(true)
            model.incrementCounter(inc)
            model.updateScreen()

            if (!model.isChoiceScreen()) {
                switchScreens()
            }
        }

        // right button
        rightBtn.setOnClickListener {
            val inc = model.getIncrementVal(false)
            model.incrementCounter(inc)
            model.updateScreen()

            if (!model.isChoiceScreen()) {
                switchScreens()
            }
        }

        // coin flip button
        coinBtn.setOnClickListener {
            val intent = Intent(activity, CoinFlipActivity::class.java)
            startActivity(intent)
        }

    }

    // switch screens to continue button
    private fun switchScreens() {
        activity?.supportFragmentManager?.commit {
            val continueFragment = ContinueFragment()
            replace(R.id.fragmentContainer, continueFragment)
            setReorderingAllowed(true)
            addToBackStack(null)
        }
    }

    // update text of top/bottom button
    private fun updateButtonText() {
        // button text changes
        val model = ViewModelProvider(requireActivity()).get(sharedViewModel::class.java)
        model.leftText.observe(viewLifecycleOwner, Observer {
            // updating left button text
            leftBtn.text = it
        })

        model.rightText.observe(viewLifecycleOwner, Observer {
            // updating right button text
            rightBtn.text = it
        })
    }
}