package com.example.rapper_list

import android.view.LayoutInflater
import android.view.TextureView
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView
import android.view.View

class RVAdapter (val items:MutableList<String>):RecyclerView.Adapter<RVAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent , false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RVAdapter.ViewHolder, position: Int) {
        holder.bindItems(items[position])
    }


    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindItems(item : String) {

            val rv_text = itemView.findViewById<TextView>(R.id.RvTextId)
            rv_text.text = item

        }
    }
}