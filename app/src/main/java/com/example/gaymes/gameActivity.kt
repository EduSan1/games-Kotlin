package com.example.gaymes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout

class gameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        val home = findViewById<ImageView>(R.id.voltar)

        home.setOnClickListener{ home()}
    }

    private fun home() {
        val intent = Intent(this, home::class.java)
        startActivity(intent)
    }
}