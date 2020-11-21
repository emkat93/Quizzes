package com.example.quizzes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
        getSupportActionBar()!!.setDisplayShowHomeEnabled(true)
        getSupportActionBar()!!.setLogo(R.mipmap.ic_launcher)
        getSupportActionBar()!!.setDisplayUseLogoEnabled(true)

        var btnMovieFinish = findViewById<Button>(R.id.btnMovieFinish)
        btnMovieFinish.setOnClickListener {
            var intent7 = Intent(this, MainActivity5::class.java)
            startActivity(intent7)
        }
    }
}