package com.menaces.fate2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.*
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

        // button functionality
        continueBtn = view.findViewById(R.id.continue_button)
        continueBtn.setOnClickListener {
            // update narration information
            model.updateScreen(1) // increment value of continue always 1

            // switch buttons if necessary
            switchScreens()
        }
    }

    private fun switchScreens () {
        // TODO: update data to data to be displayed next (counter, get from list)
        val model = ViewModelProvider(requireActivity())[SharedViewModel::class.java]

        // Change to choice screen if updated data indicates it
//        if (model.isChoiceScreen()) {
        activity?.supportFragmentManager?.commit {
            val choicesFragment = ChoicesFragment()
            replace(R.id.fragmentContainer, choicesFragment)
            setReorderingAllowed(true)
            addToBackStack(null)
        }
//        }
    }
}
