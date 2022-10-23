package com.example.pt12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var buttonState: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun LoadButton(view: View) {
        val button1: TextView = findViewById(R.id.button)
        val button2: TextView = findViewById(R.id.button2)
        if (buttonState == true) {
            button1.setVisibility(View.INVISIBLE)
            button2.setVisibility(View.VISIBLE)
            buttonState = false
        } else {
            button1.setVisibility(View.VISIBLE)
            button2.setVisibility(View.INVISIBLE)
            buttonState = true

        }

    }

    fun LoadBut(view: View) {

        val button1: TextView = findViewById(R.id.button)
        val button2: TextView = findViewById(R.id.button2)
        if (buttonState == true) {
            button1.setVisibility(View.INVISIBLE)
            button2.setVisibility(View.VISIBLE)
            buttonState = false
        } else {
            button1.setVisibility(View.VISIBLE)
            button2.setVisibility(View.INVISIBLE)
            buttonState = true

        }


    }
}