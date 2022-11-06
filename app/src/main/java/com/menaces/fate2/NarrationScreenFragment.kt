package com.menaces.fate2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.menaces.fate2.R
import com.menaces.fate2.SharedViewModel

class NarrationScreenFragment : Fragment() {

    // to contain and display shared message
    lateinit var narrationText: TextView

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

        // reference for the container declared above
        narrationText = view.findViewById(R.id.narration_text)

        // create object of com.menaces.fate2.SharedViewModel
        val model = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        // observing the change in the message declared in com.menaces.fate2.SharedViewModel
        model.message.observe(viewLifecycleOwner, Observer {
            // updating narration text
            narrationText.text = it
        })
    }
}