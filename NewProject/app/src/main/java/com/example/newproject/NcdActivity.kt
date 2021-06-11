package com.example.newproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.ncd.*

class NcdActivity : AppCompatActivity() {
    lateinit var editTextPeso : EditText
    lateinit var spinnnerFaixaEtaria : Spinner
    lateinit var spinnerNivelAtividade : Spinner
    lateinit var radioMasculino: RadioButton
    lateinit var radioFeminino: RadioButton
    lateinit var buttonCalcularNcd: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ncd)
        editTextPeso = findViewById(com.example.newproject.R.id.peso_ncd)
        spinnnerFaixaEtaria = findViewById(R.id.idade_ncd)
        spinnerNivelAtividade = findViewById(R.id.spiner_atividade_ncd)
        radioFeminino = findViewById(R.id.radioSexFem)
        radioMasculino = findViewById(R.id.radioSexMas)
        buttonCalcularNcd = findViewById(R.id.calcular_resultado_ncd)

        buttonCalcularNcd.setOnClickListener {
            calcularNcd()

        }

    }

    fun calcularNcd(){
        val peso = editTextPeso.text.toString().toDouble()
        val faixaEtaria = spinnnerFaixaEtaria.selectedItemPosition
        val nivelAtividade = spinnerNivelAtividade.selectedItemPosition
        var sexo = 'N'

        if(radioFeminino.isChecked || radioMasculino.isChecked){
            if(radioFeminino.isChecked) sexo = 'F' else sexo = 'M'
            //if(radioMasculino.isSelected) sexo = 'M'
        }else{
            Toast.makeText(this, "Selecione o sexo!", Toast.LENGTH_SHORT).show()
        }

        val ncd = com.example.newproject.calcularNcd(peso, faixaEtaria, nivelAtividade, sexo);
        val intent = Intent(this, Activity_resultado_ncd::class.java)
        intent.putExtra("ncd", ncd)
        startActivity(intent)
    }

}