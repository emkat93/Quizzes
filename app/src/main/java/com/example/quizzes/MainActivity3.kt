package com.example.quizzes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        getSupportActionBar()!!.setDisplayShowHomeEnabled(true)
        getSupportActionBar()!!.setLogo(R.mipmap.ic_launcher)
        getSupportActionBar()!!.setDisplayUseLogoEnabled(true)

        var btnAnimeNext = findViewById<Button>(R.id.btnAnimeNext)
        btnAnimeNext.setOnClickListener {
            var intent3 = Intent(this, MainActivity4::class.java)
            startActivity(intent3)

        }
    }
}