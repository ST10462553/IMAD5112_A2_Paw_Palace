package com.example.pawpalace

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity_GamesRoom : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_games_room)

        val btnSleep= findViewById<Button>(R.id.btnSleep)
        // for the explicit intent
        btnSleep.setOnClickListener {
            val intent=Intent(this@MainActivity_GamesRoom,MainActivity_Sleep::class.java)
                startActivity(intent)
        }
    }
}