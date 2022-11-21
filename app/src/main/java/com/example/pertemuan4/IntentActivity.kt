package com.example.pertemuan4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class IntentActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_FNAME = "extra_fname"
        const val EXTRA_LNAME = "extra_lname"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        val data: TextView = findViewById(R.id.this_is_other_activity)

        val fname = intent.getStringExtra(EXTRA_FNAME)
        val lname = intent.getStringExtra(EXTRA_LNAME)
        val text : String
        if(fname!=null){
             text = "Hello $fname" +
                    " $lname, this is other activity"
        }
        else{
            text = "Hello this is other activity, but without sending any data"
        }

        data.text = text

    }
}