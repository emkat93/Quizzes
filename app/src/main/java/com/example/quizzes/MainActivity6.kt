package com.example.quizzes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
        getSupportActionBar()!!.setDisplayShowHomeEnabled(true)
        getSupportActionBar()!!.setLogo(R.mipmap.ic_launcher)
        getSupportActionBar()!!.setDisplayUseLogoEnabled(true)

        var btnMovieNext = findViewById<Button>(R.id.btnMovieNext)
        btnMovieNext.setOnClickListener {
            var intent6 = Intent(this, MainActivity7::class.java)
            startActivity(intent6)
        }
    }
}