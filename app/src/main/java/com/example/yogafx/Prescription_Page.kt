package com.example.yogafx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Prescription_Page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prescription_page)


        //Button Pressing Into Switching Activities
        val headache = findViewById<Button>(R.id.headache);
        headache.setOnClickListener {
            val Intent = Intent(this,Headaches::class.java)
            startActivity(Intent) }
    }
}