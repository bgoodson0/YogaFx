package com.example.yogafx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Button Pressing Into Switching Activities
        val button1 = findViewById<Button>(R.id.button1);
        button1.setOnClickListener {
            val Intent = Intent(this,Prescription_Page::class.java);
            startActivity(Intent); }
    }
}