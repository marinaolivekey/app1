package com.example.myapplication

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView

class PicturesViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView){

  private  val themeTextView: TextView = itemView.findViewById(R.id.theme_of_pictures)
    private  val descrTextView: TextView = itemView.findViewById(R.id.descreption_of_pictures)


    fun bind(pictures: Pictures){


        themeTextView.text = "Тема - ${pictures.theme}"
        descrTextView.text = "Описание - ${pictures.descr}"
    }
}