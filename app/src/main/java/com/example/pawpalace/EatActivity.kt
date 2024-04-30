package com.example.pawpalace

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity_TheEatery : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_eatery_activity)

        val btnPlay= findViewById<Button>(R.id.btnPlay)
        //for the explicit intent
        btnPlay.setOnClickListener {
            val intent=Intent(this@MainActivity_TheEatery,MainActivity_GamesRoom::class.java)
            startActivity(intent)
        }
    }
}