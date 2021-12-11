package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

private  const val HELLO_KEY = "Hello"
class SecondActivity : AppCompatActivity() {


    lateinit var thirdscreenActivityButton: Button
    lateinit var helloTextView:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        helloTextView = findViewById(R.id.hello_text_view)

        val hellovalue: String? = intent.extras?.getString(HELLO_KEY)
        helloTextView.text = hellovalue


        thirdscreenActivityButton = findViewById(R.id.random_button)
        thirdscreenActivityButton.setOnClickListener {
            val thirdActivityIntent: Intent = Intent (this, thirdActivity::class.java)
            startActivity(thirdActivityIntent)

    }
}

}