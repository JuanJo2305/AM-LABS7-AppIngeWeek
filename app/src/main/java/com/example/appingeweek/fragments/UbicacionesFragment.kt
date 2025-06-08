package com.example.appingeweek.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import com.example.appingeweek.R
import com.example.appingeweek.adapters.UbicacionAdapter

class UbicacionesFragment : Fragment() {

    private lateinit var listView: ListView
    private lateinit var listaUbicaciones: List<String>
    private lateinit var listaImagenes: List<Int>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_ubicaciones, container, false)
        listView = view.findViewById(R.id.list_ubicaciones)

        listaUbicaciones = listOf(
            "Auditorio de Ingeniería en Energía",
            "Auditorio Ing. Agrónoma – Campus II",
            "Auditorio Biblioteca Central",
            "Capilla de la UNS",
            "Complejo deportivo UNS",
            "Plazuela de la UNS"
        )

        listaImagenes = listOf(
            R.drawable.img_audiepie,
            R.drawable.img_audiepiag,
            R.drawable.img_audibib,
            R.drawable.img_capilla,
            R.drawable.img_cduns,
            R.drawable.img_plazuela
        )

        val adapterUbic = UbicacionAdapter(requireContext(), listaUbicaciones, listaImagenes)
        listView.adapter = adapterUbic

        return view
    }
}

