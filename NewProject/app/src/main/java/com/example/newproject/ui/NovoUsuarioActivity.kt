package com.example.newproject.ui

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.newproject.R
import kotlinx.android.synthetic.main.activity_novo_usuario.*

class NovoUsuarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_novo_usuario)


        button_gravar.setOnClickListener {
            gravarUsuario()
        }
    }

    private fun gravarUsuario() {
        val dados = getSharedPreferences("dados_usuario", Context.MODE_PRIVATE)
        //*** criar o objeto que permitirá a edição do arquivo (inserir, alterar, etv)
        val editor = dados.edit()

        editor.putString("nome", et_nome.text.toString())
        editor.putString("profissao", et_profissao.text.toString())
        editor.putString("email", et_email.text.toString())
        editor.putString("senha", et_senha.text.toString())
        editor.putFloat("peso", et_peso.text.toString().toFloat())
        editor.putInt("idade", et_idade.text.toString().toInt())
        editor.apply()

        Toast.makeText(this, "Botão clicado", Toast.LENGTH_SHORT).show()
        finish()
    }

}