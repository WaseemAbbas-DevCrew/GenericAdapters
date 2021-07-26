package com.example.adapters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter = HomeRecyclerViewAdapter(
            listOf("Waseem", "Ali", "Arslan", "Jamshed", "Zahid", "Rizwan", "Naveed")
        )
        findViewById<RecyclerView>(R.id.rv_list).adapter = adapter
    }
}