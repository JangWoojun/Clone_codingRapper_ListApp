package com.example.rapper_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


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

        val items = mutableListOf<String>()
        items.add("LOVE")
        items.add("Pick up your phone")
        items.add("검정색 하트")
        items.add("단추")
        items.add("너무해")
        items.add("Never Know")
        items.add("Reset")
        items.add("야망")
        items.add("FUXX WITH ME")
        items.add("RUN")
        items.add("Freedom")

        val rv = view.findViewById<RecyclerView>(R.id.RapperRv)
        val rvadapter = RVAdapter(items)

        rv.adapter = rvadapter
        rv.layoutManager = LinearLayoutManager(context)

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