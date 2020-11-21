package com.example.quizzes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        getSupportActionBar()!!.setDisplayShowHomeEnabled(true)
        getSupportActionBar()!!.setLogo(R.mipmap.ic_launcher)
        getSupportActionBar()!!.setDisplayUseLogoEnabled(true)

        var btnAnimeFinish = findViewById<Button>(R.id.btnAnimeFinish)
        btnAnimeFinish.setOnClickListener {
            var intent4 = Intent(this, MainActivity5::class.java)
            startActivity(intent4)

        }
    }
}