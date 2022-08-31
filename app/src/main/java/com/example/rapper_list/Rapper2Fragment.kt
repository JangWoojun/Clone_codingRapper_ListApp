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

        val items = mutableListOf<String>()
        items.add("빈집")
        items.add("교통정리")
        items.add("거지")
        items.add("이혼서류")
        items.add("눈이 오던 날")
        items.add("아퍼")
        items.add("예쁘잖아")
        items.add("야망")
        items.add("내일은 없다")
        items.add("엉망진창")
        items.add("키보드")
        items.add("농담처럼")
        items.add("이때다")
        items.add("제설")
        items.add("그땐 어렸으니까")
        items.add("써니데이")
        items.add("별이지고있다")
        items.add("도쿄")
        items.add("호구")


        val rv = view.findViewById<RecyclerView>(R.id.RapperRv)
        val rvadapter = RVAdapter(items)

        rv.adapter = rvadapter
        rv.layoutManager = LinearLayoutManager(context)

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