package com.example.pawpalace

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity_Sleep : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_sleep)

        val btnFinish=findViewById<Button>(R.id.btnFinish)
        //for the explicit intent
        btnFinish.setOnClickListener {
            val intent=Intent(this@MainActivity_Sleep,MainActivity::class.java)
            startActivity(intent)
        }
    }
}