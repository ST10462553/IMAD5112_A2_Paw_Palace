package com.example.pawpalace

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val btnBegin= findViewById<Button>(R.id.btnBegin)
        //for the explicit intent
        btnBegin.setOnClickListener {

            val intent=Intent(this@MainActivity,MainActivity_TheEatery::class.java)
            startActivity(intent)
        }
    }
}



