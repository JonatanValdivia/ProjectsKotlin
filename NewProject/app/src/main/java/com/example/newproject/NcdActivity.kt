package com.example.newproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class NcdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ncd)

        val buttonCalcularNcd : Button = findViewById(R.id.calcular_resultado_ncd)

        buttonCalcularNcd.setOnClickListener {
            val intent = Intent(this, Activity_resultado_ncd::class.java)

            startActivity(intent)
        }
    }
}