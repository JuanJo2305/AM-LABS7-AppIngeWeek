package com.example.appingeweek.models

class EncuentroDeportivo(
    id: Int,
    dia: String,
    hora: String,
    lugar: String,
    val deporte: String,
    val equipoA: String,
    val equipoB: String
) : Evento(id, "Deporte", dia, hora, lugar)