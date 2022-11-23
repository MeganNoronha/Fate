package com.menaces.fate2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.menaces.fate2.R
import com.menaces.fate2.SharedViewModel

class NarrationScreenFragment : Fragment() {

    // to contain and display narration text
    lateinit var narrationText: TextView

    // to contain and display story image
    lateinit var storyImg: ImageView

    // shared view model with repository
    private val sharedViewModel: SharedViewModel by viewModels{
        SharedViewModelFactory((activity?.application as BaseApplication).repository)
    }

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

        // create object of com.menaces.fate2.SharedViewModel
        val model = ViewModelProvider(requireActivity()).get(sharedViewModel::class.java)

        // observing the change in the message declared in SharedViewModel
        model.narration.observe(viewLifecycleOwner, Observer {
            // updating narration text
            narrationText.text = it
        })

        model.image.observe(viewLifecycleOwner, Observer {
            // updating story image
            storyImg.setImageResource(it)
        })

        model.imageDesc.observe(viewLifecycleOwner, Observer {
            // updating image description
            storyImg.contentDescription = it
        })

    }
}