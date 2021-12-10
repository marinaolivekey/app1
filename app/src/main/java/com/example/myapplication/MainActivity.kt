package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

const val TAG = "MainActivity"

private const val HELLO_KEY = "Hello"

class MainActivity : AppCompatActivity() {

    lateinit var nextActivityButton: Button
    lateinit var visitGalaInst: Button
    lateinit var listRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        nextActivityButton = findViewById(R.id.see_pic_next)
        nextActivityButton.setOnClickListener {
            val secondActivityIntent: Intent = Intent (this, SecondActivity::class.java)
            secondActivityIntent.putExtra(HELLO_KEY, "Hello from MainActivity")
            startActivity(secondActivityIntent)
        }



            visitGalaInst = findViewById(R.id.visitgala)
            visitGalaInst.setOnClickListener {
                val instaLink = Uri.parse ("https://www.instagram.com/gala_zhurina_art/")
                val openBrowserIntent = Intent(Intent.ACTION_VIEW, instaLink)
                val chooser = Intent.createChooser(openBrowserIntent, "Insta")
                startActivity(chooser)
            }


             val picturesList: List<Pictures> = ListOf(
                 Pictures( "Горы", 6),
                 Pictures ("Море", 3),
                 Pictures ("Гранаты",5),
                 Pictures ("Разное", 4)
             )

        listRecyclerView = findViewById(R.id.list_pictures)
        listRecyclerView.layoutManager =
                LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false)
        listRecyclerView.adapter = PicAdapter(picturesList)



    }

}


// RecyclerView - Adapter - ViewHolder - layout
// 1. LayoutManager
// 2. Adapter

// recycleview -done
//adapter
// viewholder -для него создать класс, который будет хр даннные
// layout - done