package com.mkrdeveloper.floatingactionbuttonexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fBtn = findViewById<FloatingActionButton>(R.id.fBtn)
        val txt = findViewById<TextView>(R.id.textView)


        fBtn.setOnClickListener {
            txt.text = "MKR developer"
        }
    }
}