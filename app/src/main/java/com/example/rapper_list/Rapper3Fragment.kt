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

        val items = mutableListOf<String>()
        items.add("Vancouver")
        items.add("정이라고 하자")
        items.add("낭만교향곡")
        items.add("Love Dovey")
        items.add("Joker")
        items.add("휴")
        items.add("바다")
        items.add("010")
        items.add("문제")



        val rv = view.findViewById<RecyclerView>(R.id.RapperRv)
        val rvadapter = RVAdapter(items)

        rv.adapter = rvadapter
        rv.layoutManager = LinearLayoutManager(context)

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