package com.example.newproject.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.newproject.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    lateinit var criarConta : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        criarConta = findViewById(R.id.text_criar_conta)

        criarConta.setOnClickListener {
            val intent = Intent(this, NovoUsuarioActivity::class.java)

            startActivity(intent)
        }

        button_login.setOnClickListener {
            login()
        }

    }

    private fun login(){
        val login = edit_text_user.text.toString()//Campo nome
        val senha = edit_text_senha.text.toString()//Campo senha

        val dados = getSharedPreferences("dados_usuario", Context.MODE_PRIVATE)

        val loginGravado = dados.getString("email", "Não existe")//dados da memória
        val senhaGravado = dados.getString("senha", "Não existe")//dado da memória

        if(login == loginGravado && senha == senhaGravado){
            val intent = Intent(this, DashBoardActivity::class.java)

            startActivity(intent)
            finish()
        }else{
            Toast.makeText(this, "E-mail ou senha inválidos", Toast.LENGTH_SHORT).show()
        }

    }

}