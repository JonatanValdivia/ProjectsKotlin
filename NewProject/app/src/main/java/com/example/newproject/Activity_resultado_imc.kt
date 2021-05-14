package com.example.newproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_resultado_imc.*

class Activity_resultado_imc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_imc)

        val textViewImc: TextView = findViewById(R.id.text_view_resultado_imc)
        val textViewStatus: TextView = findViewById(R.id.text_view_status_imc)
        val textViewDicasStatus: TextView = findViewById(R.id.text_view_dicas_status)
        val peso = intent.getDoubleExtra("peso", 3.9)
        val altura = intent.getDoubleExtra("altura", 0.0)
        val imc = calcularImc(peso, altura)
        textViewImc.text =  String.format("%.1f", imc)
        val resultados = obterStatus(imc)
        textViewStatus.text = resultados[0]
        textViewDicasStatus.text = resultados[1]

        val resultado = getDica()
        text_view_dica.text = resultado[1]
        dicasTitulo.text = resultado[0]
    }
}