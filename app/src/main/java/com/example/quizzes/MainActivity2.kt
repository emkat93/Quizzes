package com.example.quizzes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        getSupportActionBar()!!.setDisplayShowHomeEnabled(true)
        getSupportActionBar()!!.setLogo(R.mipmap.ic_launcher)
        getSupportActionBar()!!.setDisplayUseLogoEnabled(true)

        var btnAnime = findViewById<Button>(R.id.BtnAnime)
        btnAnime.setOnClickListener {
            var intent2 = Intent(this, MainActivity3::class.java)
            startActivity(intent2)

        }

        var btnMovie = findViewById<Button>(R.id.BtnMovie)
        btnMovie.setOnClickListener {
            var intent5 = Intent(this, MainActivity6::class.java)
            startActivity(intent5)

        }


    }
}