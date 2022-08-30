package com.example.rapper_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController


class Rapper2Fragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_rapper2, container, false)

        val view1 = view.findViewById<ImageView>(R.id.img1)
        view1.setOnClickListener {
            it.findNavController().navigate(R.id.action_rapper2Fragment_to_rapper1Fragment)
        }

        val view3 = view.findViewById<ImageView>(R.id.img3)
        view3.setOnClickListener {
            it.findNavController().navigate(R.id.action_rapper2Fragment_to_rapper3Fragment)
        }


        return view
    }

}