package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn_submit = findViewById(R.id.btn) as Button

        btn_submit.setOnClickListener {
            val intent = Intent(this, test::class.java)
            startActivity(intent)

        }
    }}


