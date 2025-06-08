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
import com.example.appingeweek.models.Evento
import com.example.appingeweek.models.Ponencia

class SeminariosFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: EventoAdapter
    private lateinit var listaPonencias: List<Evento>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_seminarios, container, false)

        recyclerView = view.findViewById(R.id.recycler_seminarios)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        listaPonencias = generarPonenciasDummy()
        adapter = EventoAdapter(listaPonencias)
        recyclerView.adapter = adapter

        return view
    }

    private fun generarPonenciasDummy(): List<Evento> {
        val lista = ArrayList<Evento>()

        lista.add(
            Ponencia(
                id = 1,
                dia = "Martes",
                hora = "8:00 am",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería Agroindustrial",
                tema = "Hidrolisis marinos – vía enzimática",
                ponente = "Ing. Gabriel Sifuentes Penagos"
            )
        )
        lista.add(
            Ponencia(
                id = 2,
                dia = "Martes",
                hora = "8:45 am",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería Agroindustrial",
                tema = "NutriAvo: Agroindustria con propósito – Innovar, emprender y transformar desde la agricultura familiar",
                ponente = "Ing. Mirian Vásquez Chuquizuta"
            )
        )

        lista.add(
            Ponencia(
                id = 3,
                dia = "Martes",
                hora = "8:45 am",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería Agroindustrial",
                tema = "NutriAvo: Agroindustria con propósito – Innovar, emprender y transformar desde la agricultura familiar",
                ponente = "Ing. Mirian Vásquez Chuquizuta"
            )
        )

        lista.add(
            Ponencia(
                id = 4,
                dia = "Martes",
                hora = "9:30 am",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería Agroindustrial",
                tema = "“Innovación, emprendimiento y gestión agroindustrial",
                ponente = "Ing. Nadia Esther Gamarra Abanto"
            )
        )


        lista.add(
            Ponencia(
                id = 5,
                dia = "Martes",
                hora = "10:15 am",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería Agroindustrial",
                tema = "Gestion de Calidad en la produccion de Aceite de Pescado para Consumo Humano",
                ponente = "Ing. Carmen Pajuelo Carbajal"
            )
        )

        lista.add(
            Ponencia(
                id = 6,
                dia = "Martes",
                hora = "03:00 pm",
                lugar = "Auditorio Ing. Agrónoma – Campus II",
                escuela = "Escuela Profesional de Ingeniería Agrónoma",
                tema = "Manejo agronómico del cultivo de palto var. Hass",
                ponente = "Ing. Paco Chicoma Rivera"
            )
        )

        lista.add(
            Ponencia(
                id = 7,
                dia = "Martes",
                hora = "03:45 pm",
                lugar = "Auditorio Ing. Agrónoma – Campus II",
                escuela = "Escuela Profesional de Ingeniería Agrónoma",
                tema = "Estrés fisiológico de los cultivos",
                ponente = "Ing.Daleska Longobardi Méndez  "
            )
        )

        lista.add(
            Ponencia(
                id = 8,
                dia = "Martes",
                hora = "04:30 pm",
                lugar = "Auditorio Ing. Agrónoma – Campus II",
                escuela = "Escuela Profesional de Ingeniería Agrónoma",
                tema = "Agroexportación de frutales",
                ponente = "Ing. Jesús Jaque Chauca"
            )
        )

        lista.add(
            Ponencia(
                id = 9,
                dia = "Martes",
                hora = "05:15 pm",
                lugar = "Auditorio Ing. Agrónoma – Campus II",
                escuela = "Escuela Profesional de Ingeniería Agrónoma",
                tema = "Experiencias fitosanitarias en el cultivo de palto (Agro Chimu)",
                ponente = "Ms. Teófilo Arias Miranda"
            )
        )

        lista.add(
            Ponencia(
                id = 10,
                dia = "Martes",
                hora = "06:00 pm",
                lugar = "Auditorio Ing. Agrónoma – Campus II",
                escuela = "Escuela Profesional de Ingeniería Agrónoma",
                tema = "Nuevas alternativas de nutrición en el cultivo de palta (Yara Perú)",
                ponente = "Ing. Shimy Zapata Gutiérrez  "
            )
        )

        lista.add(
            Ponencia(
                id = 11,
                dia = "Martes",
                hora = "03:00 pm",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería de Sistemas e Informática",
                tema = "La inteligencia artificial y su influencia en la programación",
                ponente = "Dr. Carlos Eugenio Vega Moreno"
            )
        )

        lista.add(
            Ponencia(
                id = 12,
                dia = "Martes",
                hora = "03:45 pm",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería de Sistemas e Informática",
                tema = "Estrategias competitivas en los negocios empresariales",
                ponente = "Dra. Lisbeth Dora Briones Pereyra"
            )
        )

        lista.add(
            Ponencia(
                id = 13,
                dia = "Martes",
                hora = "04:30 pm",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería de Sistemas e Informática",
                tema = "Del dato a la decisión: Fundamentos y aplicaciones de Power BI",
                ponente = "Ms. Johan López Heredia"
            )
        )

        lista.add(
            Ponencia(
                id = 14,
                dia = "Martes",
                hora = "05:15 pm",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería de Sistemas e Informática",
                tema = "Stacking ensemble approach to diagnosing the disease of diabetes",
                ponente = "Dr. Alfredo Daza Vergaray"
            )
        )

        lista.add(
            Ponencia(
                id = 15,
                dia = "Martes",
                hora = "06:00 pm",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería de Sistemas e Informática",
                tema = "Un modelo multiclasificdor para la predicción de la carga de enfriamiento y calor en edificios residenciales",
                ponente = "Mg. Luis Enrique Ramírez Milla"
            )
        )

        lista.add(
            Ponencia(
                id = 16,
                dia = "Miércoles",
                hora = "09:00 am",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería de Sistemas e Informática",
                tema = "Agrovoltaica, una alternativa sostenible para la transición energética",
                ponente = "Dr. Denis Arangurí Cayetano "
            )
        )

        lista.add(
            Ponencia(
                id = 17,
                dia = "Miércoles",
                hora = "10:00 am",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería en Energía",
                tema = "Técnicas nucleares para detección y medición de la concentración del gas Radón (Rn-222), en hidrocarburos y el medio ambiente",
                ponente = "Msc. Carlos Montañez Montenegro"
            )
        )

        lista.add(
            Ponencia(
                id = 18,
                dia = "Miércoles",
                hora = "11:00 am",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería en Energía",
                tema = "Implementación de energía Eólica residencial en el Perú: Análisis comparativo de regulaciones Europeas",
                ponente = "M.Sc. Ricardo Antonio Cedrón Maguiña"
            )
        )

        lista.add(
            Ponencia(
                id = 19,
                dia = "Miércoles",
                hora = "03:00 pm",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería Mecánica",
                tema = "Aplicación del TPM a equipos de tratamiento de caldos del proceso de harina de pescado",
                ponente = "M.Sc. Arquímedes Iparraguirre Lozano"
            )
        )

        lista.add(
            Ponencia(
                id = 20,
                dia = "Miércoles",
                hora = "03:45 pm",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería Mecánica",
                tema = "Bloqueo y etiquetado de energía residual en la industria",
                ponente = "M.Sc. Luis Carlos Calderón Rodríguez "
            )
        )

        lista.add(
            Ponencia(
                id = 21,
                dia = "Miércoles",
                hora = "04:15 pm",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería Mecánica",
                tema = "Análisis de un sistema automático de transferencia de energía ATS",
                ponente = "Ms. Fredesbildo Fidel Ríos Noriega"
            )
        )

        lista.add(
            Ponencia(
                id = 22,
                dia = "Miércoles",
                hora = "05:00 pm",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería Mecánica",
                tema = "Aplicación de la hidrocinetica en la ingeniería",
                ponente = "M.Sc. Nelver Javier Escalante Espinoza"
            )
        )

        lista.add(
            Ponencia(
                id = 23,
                dia = "Miércoles",
                hora = "05:45 pm",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería Mecánica",
                tema = "Los retos en la fabricación de puentes metálicos en Chimbote bajo el enfoque de la metodología BIM",
                ponente = "Ing. Diego Alonso Blondet Belaunde"
            )
        )

        lista.add(
            Ponencia(
                id = 24,
                dia = "Miércoles",
                hora = "10:00 am",
                lugar = "Auditorio Biblioteca Central",
                escuela = "Escuela Profesional de Ingeniería Mecánica",
                tema = "El ingeniero como agente de cambio",
                ponente = "Ing. Jorge Castañeda Centurión"
            )
        )

        lista.add(
            Ponencia(
                id = 25,
                dia = "Miércoles",
                hora = "10:45 am",
                lugar = "Auditorio Biblioteca Central",
                escuela = "Escuela Profesional de Ingeniería Mecánica",
                tema = "Desempeño sísmico de un edificio esencial con fines de reforzamiento estructural",
                ponente = "Ing. Iván León Malo"
            )
        )

        lista.add(
            Ponencia(
                id = 26,
                dia = "Miércoles",
                hora = "11:30 am",
                lugar = "Auditorio Biblioteca Central",
                escuela = "Escuela Profesional de Ingeniería Mecánica",
                tema = "Análisis de fallas en estructuras metálicas",
                ponente = "Ing. Gumercindo Flores Reyes"
            )
        )

        lista.add(
            Ponencia(
                id = 27,
                dia = "Miércoles",
                hora = "12:30 am",
                lugar = "Auditorio Biblioteca Central",
                escuela = "Escuela Profesional de Ingeniería Mecánica",
                tema = "Cimentaciones para edificaciones en la ciudad de Chimbote, aplicando la norma E.050 de suelos y cimentaciones",
                ponente = "Ing. Jorge Morillo Trujillo "
            )
        )














        return lista
    }
}
