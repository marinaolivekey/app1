package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

const val TAG = "MainActivity"

private const val HELLO_KEY = "Hello"

class MainActivity : AppCompatActivity() {

    lateinit var nextActivityButton: Button
    lateinit var visitGalaInst: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        nextActivityButton = findViewById(R.id.see_pic_next)
        nextActivityButton.setOnClickListener {
            val secondActivityIntent: Intent = Intent (this, SecondActivity::class.java)
            secondActivityIntent.putExtra(HELLO_KEY, "Hello from MainActivity")
            startActivity(secondActivityIntent)



            visitGalaInst = findViewById(R.id.visitgala)
            visitGalaInst.setOnClickListener {
                val instaLink = Uri.parse ("https://www.instagram.com/gala_zhurina_art/")
                val openBrowserIntent = Intent(Intent.ACTION_VIEW, instaLink)
                val chooser = Intent.createChooser(openBrowserIntent, "Insta")
                startActivity(chooser)
            }
        }




    }

}