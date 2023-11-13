package com.example.task_07

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Grid : AppCompatActivity() {
    private lateinit var btnVolver: Button

    @SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)

        btnVolver=findViewById(R.id.btnVolver)

        btnVolver.setOnClickListener {

            val intent= Intent(this@Grid,MainActivity::class.java)
            startActivity(intent)
        }
    }
}