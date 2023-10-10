package com.example.wordsapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TotalActivity : AppCompatActivity() {
    private lateinit var btn1: Button
    private lateinit var btn2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.totallayout)

        this.btn1 = findViewById<Button>(R.id.buttonActivity1)
        this.btn2 = findViewById<Button>(R.id.buttonActivity2)
        // Thêm sự kiện cho nút chuyển đến Activity 1
        btn1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // Thêm sự kiện cho nút chuyển đến Activity 2
        btn2.setOnClickListener {
            val intent = Intent(this, Calling::class.java)
            startActivity(intent)
        }
    }
}