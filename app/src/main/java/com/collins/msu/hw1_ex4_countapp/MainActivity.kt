package com.collins.msu.hw1_ex4_countapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var count: TextView
    private lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        count = findViewById(R.id.count)
        btn = findViewById(R.id.btn)

        var timesClicked = 0

        btn.setOnClickListener {

            timesClicked += 1

            count.text = timesClicked.toString()
        }
    }
}