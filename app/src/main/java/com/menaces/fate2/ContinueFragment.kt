package com.menaces.fate2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.*
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class ContinueFragment : Fragment() {

    // continue button for next screen (updated narration/img)
    lateinit var continueBtn: Button

    // create object of SharedViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_continue, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val model = ViewModelProvider(requireActivity())[SharedViewModel::class.java]

        // update first screen, remove the default values
        model.updateScreen()

        // update continue button if necessary
        updateButtonText(model)

        // button functionality
        continueBtn = view.findViewById(R.id.continue_button)
        continueBtn.setOnClickListener {
            updateButtonText(model)

            // increment value of continue always 1
            val increment = model.getIncrementVal(true) // left is a stand in for continue
            model.incrementCounter(increment)
            model.updateScreen()

            // switch buttons if necessary
            if (model.isChoiceScreen()) {
                switchScreens()
            }
        }
    }

    // switch to choices buttons
    private fun switchScreens () {
        activity?.supportFragmentManager?.commit {
            val choicesFragment = ChoicesFragment()
            replace(R.id.fragmentContainer, choicesFragment)
            setReorderingAllowed(true)
            addToBackStack(null)
        }
    }

    private fun updateButtonText(model : SharedViewModel) {
        val count = model.getCounter()

        // if ending, update text
        if (count == 32) {
            // get reset text to store in the view model
            model.resetContinue()

            // update the actual text
            val model = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
            model.contButton.observe(viewLifecycleOwner, Observer {
                // updating left button text
                continueBtn.text = it
            })

            continueBtn.setOnClickListener {
                val intent = Intent(activity, StoryMenuActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
