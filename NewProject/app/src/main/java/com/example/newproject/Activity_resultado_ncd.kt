package com.example.newproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Activity_resultado_ncd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_ncd)

        val ncd = intent.getDoubleExtra("ncd", 0.0)
        val textViewResultadoNcd = findViewById<TextView>(R.id.resultado_calorias)
        textViewResultadoNcd.text = String.format("%.0f", ncd)
    }
}