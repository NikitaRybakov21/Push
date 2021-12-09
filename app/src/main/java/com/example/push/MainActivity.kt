package com.example.push

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private val ticketIdKey = "ticketId"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ticketId = intent.extras?.getString(ticketIdKey, "no value") ?: "no value"
        Toast.makeText(applicationContext, ticketId, Toast.LENGTH_SHORT).show()
    }
}