package com.example.appingeweek.models

class Ceremonia(
    id: Int,
    dia: String,
    hora: String,
    lugar: String,
    val invitados: String?,
    val programa: String?
) : Evento(id, "Ceremonia", dia, hora, lugar)
