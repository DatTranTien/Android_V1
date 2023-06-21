package com.example.b1

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.b1.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)

        binding.textViewA.text = "Hello My name is Dat"
        binding.textViewA.setTextColor(R.color.purple_700)

        binding.buttonA.setOnClickListener {
            val i = Intent(this.ac, Activity::class.java)
            startActivity(i)
        }
    }
}