package com.example.rapper_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController


class Rapper1Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_rapper1, container, false)

        val image2 = view.findViewById<ImageView>(R.id.img2)
        image2.setOnClickListener {
            it.findNavController().navigate(R.id.action_rapper1Fragment_to_rapper2Fragment)
        }

        val image3 = view.findViewById<ImageView>(R.id.img3)
        image3.setOnClickListener {
            it.findNavController().navigate(R.id.action_rapper1Fragment_to_rapper3Fragment)
        }






        return view
    }


}