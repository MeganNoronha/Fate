package com.menaces.fate2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController

class ChoicesFragment : Fragment() {
    lateinit var leftBtn: Button
    lateinit var rightBtn: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_choices, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        leftBtn = view.findViewById(R.id.left_button)
        rightBtn = view.findViewById(R.id.right_button)
        // create object of com.menaces.fate2.SharedViewModel
        val model = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        leftBtn.setOnClickListener {
            findNavController().navigate(R.id.action_choicesFragment_to_narrationScreenFragment)
        }
        rightBtn.setOnClickListener {
            findNavController().navigate(R.id.action_choicesFragment_to_narrationScreenFragment)
        }
    }

    fun goToNextScreen() {
        // TODO: Navigate to the AccompanimentMenuFragment
        findNavController().navigate(R.id.action_choicesFragment_to_narrationScreenFragment)
    }
}