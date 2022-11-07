package com.menaces.fate2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.menaces.fate2.R
import com.menaces.fate2.SharedViewModel

class NarrationScreenFragment : Fragment() {

    // to contain and display narration text
    lateinit var narrationText: TextView

    // to contain and display story image
    lateinit var storyImg: ImageView

    lateinit var continueBtn: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // inflate the fragment layout
        return inflater.inflate(R.layout.fragment_narration_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // reference for the containers declared above
        narrationText = view.findViewById(R.id.narration_text)
        storyImg = view.findViewById(R.id.narration_img)
        continueBtn = view.findViewById(R.id.continue_button)

        // create object of com.menaces.fate2.SharedViewModel
        val model = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        // observing the change in the message declared in SharedViewModel
        model.narration.observe(viewLifecycleOwner, Observer {
            // updating narration text
            narrationText.text = it
        })

        model.image.observe(viewLifecycleOwner, Observer {
            // updating story image
            storyImg.setImageResource(it)
        })
        // call function "sendMessage" defined in SharedVieModel
        // to store the value in narration/image.
        var counter = 0
        continueBtn.setOnClickListener {
            findNavController().navigate(R.id.action_narrationScreenFragment_to_choicesFragment)
//            model.updateScreen(counter)
        }
    }
}