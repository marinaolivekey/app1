package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PicAdapter(private val picturesList: List<Pictures>): RecyclerView.Adapter<PicturesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PicturesViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_pictures_item, parent,false)
        return PicturesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PicturesViewHolder, position: Int) {
        val pictures=picturesList[position]
        holder.bind(pictures)
    }

    override fun getItemCount(): Int {
        return picturesList.size
    }


}