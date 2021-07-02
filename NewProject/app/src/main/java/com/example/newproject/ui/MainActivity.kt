package com.example.newproject.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.newproject.R


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

        var cardNdc = findViewById<CardView>(R.id.card_ndc)
        cardNdc.setOnClickListener {
            val abrirNcdActivity = Intent(this, NcdActivity::class.java);
            startActivity(abrirNcdActivity)
        }
    }
}