package com.example.newproject.model

import android.graphics.Bitmap
import java.time.LocalDate

//Esta é uma classe de dados, então especificamos isso com data;
//Para dizer que será um construtor, fazemos na classe e colocamos os ()
data class Usuario(
    var id: Int = 0, //Automático através do banco
    var nome: String,
    var profissao: String,
    var email: String,
    var senha: String,
    var dataNascimento: String, //A classe Calendar foi depreciada
    var sexo: Char,
    var altura: Double,
    //Fazer com que o valor seja anulável, deixar como nulo
    var foto: Bitmap? = null //Para armazenas uma imagem
)
    //Instanciando o objeto construtor e dando a ele os seus respectivos valores
    //val user = Usuario( 5, "Pedro", "pedro@emial.com");