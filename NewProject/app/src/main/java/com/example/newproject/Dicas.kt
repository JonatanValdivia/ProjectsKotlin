package com.example.newproject

import java.util.*


fun getDica() : List<String>{
    val dicas = listOf(
        listOf("Alimente-se melhor (1)", "Reduza alimentos com gordura, açúcar e sal. Tenha sempre frutas, verduras e legumes na alimentação diária."),
        listOf("Beba água (1)", "Não espere ter sede para beber água. Quando você tem sede, significa que o corpo já está desidratado."),
        listOf("Durma bem (1)", "Crie um ritual, deixe o ambiente escuro e silencioso. Quem dorme pouco e tem uma qualidade de sono ruim, tem mais chances de aumentar o peso.", ""),
        listOf("Movimente-se (1)", "Inicie uma atividade física. Evite escadas rolantes e elevadores e suba a pé.")
    )
    val sorteio = Random()
    val dicasDoDia = sorteio.nextInt(dicas.size)

    return dicas[dicasDoDia]

}