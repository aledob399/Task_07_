package com.example.task_07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var Menu: EditText
    private lateinit var btnLinear: Button
    private lateinit var btnTable: Button
    private lateinit var btnRelative: Button
    private lateinit var btnGrid: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLinear=findViewById(R.id.btnLinear)
        btnTable=findViewById(R.id.btnTable)
        btnRelative=findViewById(R.id.btnRelative)
        btnGrid=findViewById(R.id.btnGrid)

        btnLinear.setOnClickListener {

            val intent= Intent(this@MainActivity,Linear::class.java)
            startActivity(intent)
        }
        btnTable.setOnClickListener {

            val intent= Intent(this@MainActivity,Table::class.java)
            startActivity(intent)
        }
        btnRelative.setOnClickListener {

            val intent= Intent(this@MainActivity,Relative::class.java)
            startActivity(intent)
        }
        btnGrid.setOnClickListener {

            val intent= Intent(this@MainActivity,Grid::class.java)
            startActivity(intent)
        }

    }
}