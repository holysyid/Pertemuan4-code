package com.example.pertemuan4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout)

        supportActionBar?.title = "Title Placeholder"
    }
}