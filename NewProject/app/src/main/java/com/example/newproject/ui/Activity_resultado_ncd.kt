package com.example.newproject.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.newproject.R

class Activity_resultado_ncd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_ncd)

        val ncd = intent.getDoubleExtra("ncd", 0.0)
        val textViewResultadoNcd = findViewById<TextView>(R.id.resultado_calorias)
        textViewResultadoNcd.text = String.format("%.0f", ncd)
    }
}