package com.example.newproject.model

class Pesagem (
    var id: Int = 0,
    var peso: Double = 0.0,
    var nivelAtividade: Int = 0,
    var dataPesagem: String? = null,
    var usuario: Usuario
)