package com.example.gaymes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.LinearLayout

class searchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        val game = findViewById<LinearLayout>(R.id.selecionar)

        game.setOnClickListener{ jogo()}
    }

    private fun jogo() {
        val intent = Intent(this, gameActivity::class.java)
        startActivity(intent)
    }
}

