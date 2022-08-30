package com.example.rapper_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController


class Rapper3Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_rapper3, container, false)

        val view1 = view.findViewById<ImageView>(R.id.img1)
        view1.setOnClickListener {
            it.findNavController().navigate(R.id.action_rapper3Fragment_to_rapper1Fragment)
        }

        val view2 = view.findViewById<ImageView>(R.id.img2)
        view2.setOnClickListener {
            it.findNavController().navigate(R.id.action_rapper3Fragment_to_rapper2Fragment)
        }

        return view
    }


}