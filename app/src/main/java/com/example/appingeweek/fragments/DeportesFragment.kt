package com.example.appingeweek.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.appingeweek.R
import com.example.appingeweek.adapters.EventoAdapter
import com.example.appingeweek.models.EncuentroDeportivo
import com.example.appingeweek.models.Evento

class DeportesFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: EventoAdapter
    private lateinit var listaDeportes: List<Evento>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_deportes, container, false)

        recyclerView = view.findViewById(R.id.recycler_deportes)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        listaDeportes = generarEncuentrosDummy()
        adapter = EventoAdapter(listaDeportes)
        recyclerView.adapter = adapter

        return view
    }

    private fun generarEncuentrosDummy(): List<Evento> {
        val lista = ArrayList<Evento>()

        lista.add(
            EncuentroDeportivo(
                id = 1,
                dia = "Jueves",
                hora = "03:00 pm",
                lugar = "Complejo deportivo UNS",
                deporte = "Fútbol",
                equipoA = "Escuela Campeón 2024",
                equipoB = "Club UNS"
            )
        )
        lista.add(
            EncuentroDeportivo(
                id = 2,
                dia = "Jueves",
                hora = "04:00 pm",
                lugar = "Complejo deportivo UNS",
                deporte = "Fútbol",
                equipoA = "Egresados Ingenieros Master 1",
                equipoB = "Egresados Ingenieros Master 2"
            )
        )

        lista.add(
            EncuentroDeportivo(
                id = 3,
                dia = "Jueves",
                hora = "04:00 pm",
                lugar = "Complejo deportivo UNS",
                deporte = "Fútbol",
                equipoA = "Egresados Ingenieros Master 1",
                equipoB = "Egresados Ingenieros Master 2"
            )
        )

        lista.add(
            EncuentroDeportivo(
                id = 3,
                dia = "Viernes",
                hora = "09:00 am",
                lugar = "Complejo deportivo UNS",
                deporte = "Fútbol",
                equipoA = "Ing. Agrónoma",
                equipoB = "Ing. Sistema"
            )
        )

        lista.add(
            EncuentroDeportivo(
                id = 4,
                dia = "Viernes",
                hora = "09:00 am",
                lugar = "Complejo deportivo UNS",
                deporte = "Fútbol",
                equipoA = "Ing. Mecánica",
                equipoB = "Ing. Agroindustrial"
            )
        )

        lista.add(
            EncuentroDeportivo(
                id = 5,
                dia = "Viernes",
                hora = "09:00 am",
                lugar = "Complejo deportivo UNS",
                deporte = "Fútbol",
                equipoA = "Ing. Energía",
                equipoB = "Ing. Civil"
            )
        )

        lista.add(
            EncuentroDeportivo(
                id = 6,
                dia = "Viernes",
                hora = "03:00 pm",
                lugar = "Complejo deportivo UNS",
                deporte = "Vóley",
                equipoA = "Ing. Agrónoma",
                equipoB = "Ing. Sistema"
            )
        )

        lista.add(
            EncuentroDeportivo(
                id = 7,
                dia = "Viernes",
                hora = "03:00 pm",
                lugar = "Complejo deportivo UNS",
                deporte = "Vóley",
                equipoA = "Ing. Mecánica",
                equipoB = "Ing. Agroindustrial"
            )
        )

        lista.add(
            EncuentroDeportivo(
                id = 8,
                dia = "Viernes",
                hora = "03:00 pm",
                lugar = "Complejo deportivo UNS",
                deporte = "Vóley",
                equipoA = "Ing. Energía",
                equipoB = "Ing. Civil"
            )
        )

        lista.add(
            EncuentroDeportivo(
                id = 9,
                dia = "Viernes",
                hora = "09:00 am",
                lugar = "Complejo deportivo UNS",
                deporte = "Básquet",
                equipoA = "Ing. Agrónoma",
                equipoB = "Ing. Sistema"
            )
        )

        lista.add(
            EncuentroDeportivo(
                id = 7,
                dia = "Viernes",
                hora = "09:00 am",
                lugar = "Complejo deportivo UNS",
                deporte = "Básquet",
                equipoA = "Ing. Mecánica",
                equipoB = "Ing. Agroindustrial"
            )
        )

        lista.add(
            EncuentroDeportivo(
                id = 8,
                dia = "Viernes",
                hora = "09:00 am",
                lugar = "Complejo deportivo UNS",
                deporte = "Básquet",
                equipoA = "Ing. Energía",
                equipoB = "Ing. Civil"
            )
        )


        return lista
    }
}
