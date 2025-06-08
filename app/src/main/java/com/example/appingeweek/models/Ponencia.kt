package com.example.appingeweek.models

class Ponencia(
    id: Int,
    dia: String,
    hora: String,
    lugar: String,
    tema: String,
    val escuela: String,
    val ponente: String

) : Evento(id, "Ponencia", dia, hora, lugar)