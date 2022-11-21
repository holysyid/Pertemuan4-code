package com.example.pertemuan4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivityExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example)

        val info : TextView = findViewById(R.id.tv_example)

    }
}