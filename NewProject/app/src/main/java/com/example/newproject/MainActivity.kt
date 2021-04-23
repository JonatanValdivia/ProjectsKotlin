package com.example.newproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Clique no card IMC
        var cardImc = findViewById<CardView>(R.id.card_imc)
        cardImc.setOnClickListener {
           // Toast.makeText(this, "IMC foi clicado", Toast.LENGTH_LONG).show()
            val abrirImcActivity = Intent(this, ImcActivity2::class.java)
            startActivity(abrirImcActivity)
        }
    }
}