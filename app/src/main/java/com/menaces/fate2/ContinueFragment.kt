package com.menaces.fate2

import android.os.Bundle
import android.text.TextUtils.replace
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.*
import androidx.lifecycle.ViewModelProvider

class ContinueFragment : Fragment() {

    // continue button for next screen (updated narration/img)
    lateinit var continueBtn: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_continue, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // reference for button
        continueBtn = view.findViewById(R.id.continue_button)

        // create object of SharedViewModel
        val model = ViewModelProvider(requireActivity())[SharedViewModel::class.java]
        continueBtn.setOnClickListener {
            model.updateScreen()
            // switch buttons if necessary
            switchScreens()
        }
    }

    fun switchScreens () {
        // TODO: update data to data to be displayed next (counter, get from list)

        // TODO: check if the screen to be displayed is a choice screen (using Screen object)
        // Switch screens if necessary

        activity?.supportFragmentManager?.commit {
            val choicesFragment = ChoicesFragment()
            replace(R.id.fragmentContainer, choicesFragment)
            setReorderingAllowed(true)
            addToBackStack(null)
        }
//
//        childFragmentManager.commit {
//            val continueFragment = childFragmentManager.findFragmentById(R.id.fragmentContainer)
//            setReorderingAllowed(true)
//            addToBackStack(null)
//        }
    }
}
