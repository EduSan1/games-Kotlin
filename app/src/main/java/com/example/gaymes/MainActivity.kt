package com.example.gaymes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.concurrent.schedule

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Timer().schedule(2000){splash()}

    }

    private fun splash() {
        val intent = Intent(this, home::class.java)

        startActivity(intent)

        finish()
    }


}