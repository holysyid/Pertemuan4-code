package com.example.pertemuan4

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button

import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Explicit Intent
        val btnMoveActivity: Button = findViewById(R.id.button_1)
        val btnMAWData: Button = findViewById(R.id.button_2)

        //Implicit Intent
        val btnImplicitInt: Button = findViewById(R.id.button_3)

        btnMoveActivity.setOnClickListener(this)
        btnMAWData.setOnClickListener(this)
        btnImplicitInt.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button_1 -> {
                val moveIntent = Intent(this, ActivityExample::class.java)
                startActivity(moveIntent)
            }
            R.id.button_2 -> {
                val data1: TextView = findViewById(R.id.et_first_name)
                val data2: TextView = findViewById(R.id.et_last_name)

                val moveWithDataIntent = Intent(this@MainActivity, IntentActivity::class.java)
                moveWithDataIntent.putExtra(IntentActivity.EXTRA_FNAME, data1.text )
                moveWithDataIntent.putExtra(IntentActivity.EXTRA_LNAME, data2.text )
                startActivity(moveWithDataIntent)
            }
            R.id.button_3 -> {
                val contactdata: TextView = findViewById(R.id.et_contact_no)
                val data = contactdata.text
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$data"))
                startActivity(dialPhoneIntent)
            }
        }
    }

}

