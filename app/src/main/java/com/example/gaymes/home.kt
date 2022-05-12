package com.example.gaymes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val pesquisa = findViewById<EditText>(R.id.pesquisar)

        pesquisa.setOnClickListener{ pesquisar()}
    }

    private fun pesquisar() {
        val intent = Intent(this, searchActivity::class.java)
        startActivity(intent)
    }
}