package com.example.appingeweek.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.appingeweek.R
import com.example.appingeweek.adapters.EventoAdapter
import com.example.appingeweek.models.*
import java.util.*

class AgendaFragment : Fragment() {

    private lateinit var spinnerDias: AutoCompleteTextView
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: EventoAdapter
    private lateinit var listaCompleta: List<Evento>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_agenda, container, false)

        spinnerDias = view.findViewById(R.id.spinner_dias)
        recyclerView = view.findViewById(R.id.recycler_agenda)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        listaCompleta = generarEventosDummy()
        adapter = EventoAdapter(listaCompleta)
        recyclerView.adapter = adapter

        val dias = listOf("Todos", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes")
        val spinnerAdapter = ArrayAdapter(
            requireContext(),
            R.layout.list_item,
            dias
        )

        spinnerDias.setAdapter(spinnerAdapter)

        spinnerDias.setOnItemClickListener { _, _, position, _ ->
            val diaSeleccionado = dias[position]
            filtrarPorDia(diaSeleccionado)
        }

        return view
    }

    private fun filtrarPorDia(dia: String) {
        if (dia == "Todos") {
            adapter.actualizarLista(listaCompleta)
        } else {
            val filtrados = listaCompleta.filter { it.dia.equals(dia, ignoreCase = true) }
            adapter.actualizarLista(filtrados)
        }
    }

    private fun generarEventosDummy(): List<Evento> {
        val eventos = ArrayList<Evento>()

        // Ceremonias
        eventos.add(
            Ceremonia(
                id = 1,
                dia = "Lunes",
                hora = "09:00",
                lugar = " Plazuela de la UNS ",
                invitados = "Autoridades UNS, Delegaciones de las \n" +
                            "Escuelas Profesionales de la Facultad de Ingeniería, \n" +
                            "Colaboradores Administrativos, Docentes, Centros \n" +
                            "de Producción y Estudiantes",
                programa = "Ceremonia de Inauguración de la semana del ingeniero  \n" +
                            "• Izamiento del pabellón nacional. \n" +
                            "• Brindis por las autoridades. \n" +
                            "• Compartir"
            )
        )
        eventos.add(
            Ceremonia(
                id = 2,
                dia = "Jueves",
                hora = "09:00 am",
                lugar = "Capilla de la UNS",
                invitados = "DELEGACIONES DE LAS E.P. DE LA FACULTAD,ADMINISTRATIVOS, DOCENTES, CENTROS DE PRODUCCIÓN DELEGACIONES DE LAS E.P. DE LA FACULTAD,ADMINISTRATIVOS, DOCENTES, CENTROS DE PRODUCCIÓN ",
                programa = "Misa"
            )
        )

        eventos.add(
            Ceremonia(
                id = 3,
                dia = "Jueves",
                hora = "10:00 am",
                lugar = "Auditorio EPIE",
                invitados = "",
                programa = "• Himno Nacional \n" +
                            "• Palabras de Bienvenida a cargo del Presidente de la Comisión Central.\n" +
                            "• Palabras del Decano de la Facultad de Ingeniería \n" +
                            "• Reconocimiento a Estudiantes de los Primeros Puestos de cada Escuela \n" +
                            "• Reconocimiento a los Docentes por Escuela de la Facultad de Ingeniería. \n" +
                            "• Palabras de la Rectora de la Universidad Nacional del Santa \n" +
                            "• Brindis de Honor a cargo del Mejor Ingeniero Docente de la Facultad de Ingeniería. "
            )
        )

        eventos.add(
            Ceremonia(
                id = 4,
                dia = "Jueves",
                hora = "03:00 pm",
                lugar = " Puerta 1. Campus Universitario",
                invitados = "",
                programa = "Corso Interescuelas"
            )
        )

        eventos.add(
            Ceremonia(
                id = 5,
                dia = "Viernes",
                hora = "01:00 pm",
                lugar = "Complejo deportivo UNS",
                invitados = "",
                programa = "Compartir de Confraternidad: Almuerzo"
            )
        )

        eventos.add(
            Ceremonia(
                id = 6,
                dia = "Viernes",
                hora = "03:00 pm",
                lugar = "Complejo deportivo UNS",
                invitados = "",
                programa = "Final del Campeonato Inter escuelas de Fútbol, Vóley y Básquet"
            )
        )

        eventos.add(
            Ceremonia(
                id = 7,
                dia = "Viernes",
                hora = "06:00 pm",
                lugar = "Complejo deportivo UNS",
                invitados = "",
                programa = "Premiación de Equipos Ganadores"
            )
        )

        eventos.add(
            Ceremonia(
                id = 8,
                dia = "Viernes",
                hora = "06:15 pm",
                lugar = "Complejo deportivo UNS",
                invitados = "",
                programa = "Clausura"
            )
        )



        // Ponencias
        eventos.add(
            Ponencia(
                id = 9,
                dia = "Martes",
                hora = "8:00 am",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería Agroindustrial",
                tema = "Hidrolisis marinos – vía enzimática",
                ponente = "Ing. Gabriel Sifuentes Penagos"
            )
        )
        eventos.add(
            Ponencia(
                id = 10,
                dia = "Martes",
                hora = "8:45 am",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería Agroindustrial",
                tema = "NutriAvo: Agroindustria con propósito – Innovar, emprender y transformar desde la agricultura familiar",
                ponente = "Ing. Mirian Vásquez Chuquizuta"
            )
        )

        eventos.add(
            Ponencia(
                id = 11,
                dia = "Martes",
                hora = "8:45 am",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería Agroindustrial",
                tema = "NutriAvo: Agroindustria con propósito – Innovar, emprender y transformar desde la agricultura familiar",
                ponente = "Ing. Mirian Vásquez Chuquizuta"
            )
        )

        eventos.add(
            Ponencia(
                id = 12,
                dia = "Martes",
                hora = "9:30 am",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería Agroindustrial",
                tema = "“Innovación, emprendimiento y gestión agroindustrial",
                ponente = "Ing. Nadia Esther Gamarra Abanto"
            )
        )


        eventos.add(
            Ponencia(
                id = 13,
                dia = "Martes",
                hora = "10:15 am",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería Agroindustrial",
                tema = "Gestion de Calidad en la produccion de Aceite de Pescado para Consumo Humano",
                ponente = "Ing. Carmen Pajuelo Carbajal"
            )
        )

        eventos.add(
            Ponencia(
                id = 14,
                dia = "Martes",
                hora = "03:00 pm",
                lugar = "Auditorio Ing. Agrónoma – Campus II",
                escuela = "Escuela Profesional de Ingeniería Agrónoma",
                tema = "Manejo agronómico del cultivo de palto var. Hass",
                ponente = "Ing. Paco Chicoma Rivera"
            )
        )

        eventos.add(
            Ponencia(
                id = 15,
                dia = "Martes",
                hora = "03:45 pm",
                lugar = "Auditorio Ing. Agrónoma – Campus II",
                escuela = "Escuela Profesional de Ingeniería Agrónoma",
                tema = "Estrés fisiológico de los cultivos",
                ponente = "Ing.Daleska Longobardi Méndez  "
            )
        )

        eventos.add(
            Ponencia(
                id = 16,
                dia = "Martes",
                hora = "04:30 pm",
                lugar = "Auditorio Ing. Agrónoma – Campus II",
                escuela = "Escuela Profesional de Ingeniería Agrónoma",
                tema = "Agroexportación de frutales",
                ponente = "Ing. Jesús Jaque Chauca"
            )
        )

        eventos.add(
            Ponencia(
                id = 17,
                dia = "Martes",
                hora = "05:15 pm",
                lugar = "Auditorio Ing. Agrónoma – Campus II",
                escuela = "Escuela Profesional de Ingeniería Agrónoma",
                tema = "Experiencias fitosanitarias en el cultivo de palto (Agro Chimu)",
                ponente = "Ms. Teófilo Arias Miranda"
            )
        )

        eventos.add(
            Ponencia(
                id = 18,
                dia = "Martes",
                hora = "06:00 pm",
                lugar = "Auditorio Ing. Agrónoma – Campus II",
                escuela = "Escuela Profesional de Ingeniería Agrónoma",
                tema = "Nuevas alternativas de nutrición en el cultivo de palta (Yara Perú)",
                ponente = "Ing. Shimy Zapata Gutiérrez  "
            )
        )

        eventos.add(
            Ponencia(
                id = 19,
                dia = "Martes",
                hora = "03:00 pm",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería de Sistemas e Informática",
                tema = "La inteligencia artificial y su influencia en la programación",
                ponente = "Dr. Carlos Eugenio Vega Moreno"
            )
        )

        eventos.add(
            Ponencia(
                id = 20,
                dia = "Martes",
                hora = "03:45 pm",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería de Sistemas e Informática",
                tema = "Estrategias competitivas en los negocios empresariales",
                ponente = "Dra. Lisbeth Dora Briones Pereyra"
            )
        )

        eventos.add(
            Ponencia(
                id = 21,
                dia = "Martes",
                hora = "04:30 pm",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería de Sistemas e Informática",
                tema = "Del dato a la decisión: Fundamentos y aplicaciones de Power BI",
                ponente = "Ms. Johan López Heredia"
            )
        )

        eventos.add(
            Ponencia(
                id = 22,
                dia = "Martes",
                hora = "05:15 pm",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería de Sistemas e Informática",
                tema = "Stacking ensemble approach to diagnosing the disease of diabetes",
                ponente = "Dr. Alfredo Daza Vergaray"
            )
        )

        eventos.add(
            Ponencia(
                id = 23,
                dia = "Martes",
                hora = "06:00 pm",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería de Sistemas e Informática",
                tema = "Un modelo multiclasificdor para la predicción de la carga de enfriamiento y calor en edificios residenciales",
                ponente = "Mg. Luis Enrique Ramírez Milla"
            )
        )

        eventos.add(
            Ponencia(
                id = 24,
                dia = "Miércoles",
                hora = "09:00 am",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería de Sistemas e Informática",
                tema = "Agrovoltaica, una alternativa sostenible para la transición energética",
                ponente = "Dr. Denis Arangurí Cayetano "
            )
        )

        eventos.add(
            Ponencia(
                id = 25,
                dia = "Miércoles",
                hora = "10:00 am",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería en Energía",
                tema = "Técnicas nucleares para detección y medición de la concentración del gas Radón (Rn-222), en hidrocarburos y el medio ambiente",
                ponente = "Msc. Carlos Montañez Montenegro"
            )
        )

        eventos.add(
            Ponencia(
                id = 26,
                dia = "Miércoles",
                hora = "11:00 am",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería en Energía",
                tema = "Implementación de energía Eólica residencial en el Perú: Análisis comparativo de regulaciones Europeas",
                ponente = "M.Sc. Ricardo Antonio Cedrón Maguiña"
            )
        )

        eventos.add(
            Ponencia(
                id = 27,
                dia = "Miércoles",
                hora = "03:00 pm",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería Mecánica",
                tema = "Aplicación del TPM a equipos de tratamiento de caldos del proceso de harina de pescado",
                ponente = "M.Sc. Arquímedes Iparraguirre Lozano"
            )
        )

        eventos.add(
            Ponencia(
                id = 28,
                dia = "Miércoles",
                hora = "03:45 pm",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería Mecánica",
                tema = "Bloqueo y etiquetado de energía residual en la industria",
                ponente = "M.Sc. Luis Carlos Calderón Rodríguez "
            )
        )

        eventos.add(
            Ponencia(
                id = 29,
                dia = "Miércoles",
                hora = "04:15 pm",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería Mecánica",
                tema = "Análisis de un sistema automático de transferencia de energía ATS",
                ponente = "Ms. Fredesbildo Fidel Ríos Noriega"
            )
        )

        eventos.add(
            Ponencia(
                id = 30,
                dia = "Miércoles",
                hora = "05:00 pm",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería Mecánica",
                tema = "Aplicación de la hidrocinetica en la ingeniería",
                ponente = "M.Sc. Nelver Javier Escalante Espinoza"
            )
        )

        eventos.add(
            Ponencia(
                id = 31,
                dia = "Miércoles",
                hora = "05:45 pm",
                lugar = "Auditorio EPIE",
                escuela = "Escuela Profesional de Ingeniería Mecánica",
                tema = "Los retos en la fabricación de puentes metálicos en Chimbote bajo el enfoque de la metodología BIM",
                ponente = "Ing. Diego Alonso Blondet Belaunde"
            )
        )

        eventos.add(
            Ponencia(
                id = 32,
                dia = "Miércoles",
                hora = "10:00 am",
                lugar = "Auditorio Biblioteca Central",
                escuela = "Escuela Profesional de Ingeniería Mecánica",
                tema = "El ingeniero como agente de cambio",
                ponente = "Ing. Jorge Castañeda Centurión"
            )
        )

        eventos.add(
            Ponencia(
                id = 33,
                dia = "Miércoles",
                hora = "10:45 am",
                lugar = "Auditorio Biblioteca Central",
                escuela = "Escuela Profesional de Ingeniería Mecánica",
                tema = "Desempeño sísmico de un edificio esencial con fines de reforzamiento estructural",
                ponente = "Ing. Iván León Malo"
            )
        )

        eventos.add(
            Ponencia(
                id = 34,
                dia = "Miércoles",
                hora = "11:30 am",
                lugar = "Auditorio Biblioteca Central",
                escuela = "Escuela Profesional de Ingeniería Mecánica",
                tema = "Análisis de fallas en estructuras metálicas",
                ponente = "Ing. Gumercindo Flores Reyes"
            )
        )

        eventos.add(
            Ponencia(
                id = 35,
                dia = "Miércoles",
                hora = "12:30 am",
                lugar = "Auditorio Biblioteca Central",
                escuela = "Escuela Profesional de Ingeniería Mecánica",
                tema = "Cimentaciones para edificaciones en la ciudad de Chimbote, aplicando la norma E.050 de suelos y cimentaciones",
                ponente = "Ing. Jorge Morillo Trujillo "
            )
        )

        // Deportes
        eventos.add(
            EncuentroDeportivo(
                id = 36,
                dia = "Jueves",
                hora = "03:00 pm",
                lugar = "Complejo deportivo UNS",
                deporte = "Fútbol",
                equipoA = "Escuela Campeón 2024",
                equipoB = "Club UNS"
            )
        )
        eventos.add(
            EncuentroDeportivo(
                id = 37,
                dia = "Jueves",
                hora = "04:00 pm",
                lugar = "Complejo deportivo UNS",
                deporte = "Fútbol",
                equipoA = "Egresados Ingenieros Master 1",
                equipoB = "Egresados Ingenieros Master 2"
            )
        )

        eventos.add(
            EncuentroDeportivo(
                id = 38,
                dia = "Jueves",
                hora = "04:00 pm",
                lugar = "Complejo deportivo UNS",
                deporte = "Fútbol",
                equipoA = "Egresados Ingenieros Master 1",
                equipoB = "Egresados Ingenieros Master 2"
            )
        )

        eventos.add(
            EncuentroDeportivo(
                id = 39,
                dia = "Viernes",
                hora = "09:00 am",
                lugar = "Complejo deportivo UNS",
                deporte = "Fútbol",
                equipoA = "Ing. Agrónoma",
                equipoB = "Ing. Sistema"
            )
        )

        eventos.add(
            EncuentroDeportivo(
                id = 40,
                dia = "Viernes",
                hora = "09:00 am",
                lugar = "Complejo deportivo UNS",
                deporte = "Fútbol",
                equipoA = "Ing. Mecánica",
                equipoB = "Ing. Agroindustrial"
            )
        )

        eventos.add(
            EncuentroDeportivo(
                id = 41,
                dia = "Viernes",
                hora = "09:00 am",
                lugar = "Complejo deportivo UNS",
                deporte = "Fútbol",
                equipoA = "Ing. Energía",
                equipoB = "Ing. Civil"
            )
        )

        eventos.add(
            EncuentroDeportivo(
                id = 42,
                dia = "Viernes",
                hora = "03:00 pm",
                lugar = "Complejo deportivo UNS",
                deporte = "Vóley",
                equipoA = "Ing. Agrónoma",
                equipoB = "Ing. Sistema"
            )
        )

        eventos.add(
            EncuentroDeportivo(
                id = 43,
                dia = "Viernes",
                hora = "03:00 pm",
                lugar = "Complejo deportivo UNS",
                deporte = "Vóley",
                equipoA = "Ing. Mecánica",
                equipoB = "Ing. Agroindustrial"
            )
        )

        eventos.add(
            EncuentroDeportivo(
                id = 44,
                dia = "Viernes",
                hora = "03:00 pm",
                lugar = "Complejo deportivo UNS",
                deporte = "Vóley",
                equipoA = "Ing. Energía",
                equipoB = "Ing. Civil"
            )
        )

        eventos.add(
            EncuentroDeportivo(
                id = 45,
                dia = "Viernes",
                hora = "09:00 am",
                lugar = "Complejo deportivo UNS",
                deporte = "Básquet",
                equipoA = "Ing. Agrónoma",
                equipoB = "Ing. Sistema"
            )
        )

        eventos.add(
            EncuentroDeportivo(
                id = 46,
                dia = "Viernes",
                hora = "09:00 am",
                lugar = "Complejo deportivo UNS",
                deporte = "Básquet",
                equipoA = "Ing. Mecánica",
                equipoB = "Ing. Agroindustrial"
            )
        )

        eventos.add(
            EncuentroDeportivo(
                id = 47,
                dia = "Viernes",
                hora = "09:00 am",
                lugar = "Complejo deportivo UNS",
                deporte = "Básquet",
                equipoA = "Ing. Energía",
                equipoB = "Ing. Civil"
            )
        )

        return eventos
    }
}

