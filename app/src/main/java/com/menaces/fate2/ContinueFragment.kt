package com.menaces.fate2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
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

        // create object of com.menaces.fate2.SharedViewModel
//        val model = ViewModelProvider(requireActivity())[SharedViewModel::class.java]

        // call function "sendMessage" defined in SharedVieModel
        // to store the value in message.
//        var counter = 0
//        continueBtn.setOnClickListener {model.sendMessage(updateNarration.)}
    }
}
