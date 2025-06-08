package com.example.appingeweek.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView
import com.example.appingeweek.R
import com.example.appingeweek.models.Ceremonia
import com.example.appingeweek.models.EncuentroDeportivo
import com.example.appingeweek.models.Ponencia
import com.example.appingeweek.models.Evento

class EventoAdapter(private var listaEventos: List<Evento>)
    : RecyclerView.Adapter<EventoAdapter.EventoViewHolder>() {

    inner class EventoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val card: MaterialCardView = itemView.findViewById(R.id.card_evento)
        val tvTipo: TextView = itemView.findViewById(R.id.tv_tipo)
        val tvDetalle1: TextView = itemView.findViewById(R.id.tv_detalle1)
        val tvDetalle2: TextView = itemView.findViewById(R.id.tv_detalle2)
        val tvLugar: TextView = itemView.findViewById(R.id.tv_lugar)
        val tvHora: TextView = itemView.findViewById(R.id.tv_hora)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_evento, parent, false)
        return EventoViewHolder(view)
    }

    override fun onBindViewHolder(holder: EventoViewHolder, position: Int) {
        val evento = listaEventos[position]
        holder.tvTipo.text = evento.tipo
        holder.tvHora.text = evento.hora
        holder.tvLugar.text = evento.lugar

        when (evento) {
            is Ceremonia -> {
                holder.tvDetalle1.text = "Invitados: ${evento.invitados ?: "N/A"}"
                holder.tvDetalle2.text = "Programa: ${evento.programa ?: "N/A"}"
            }
            is Ponencia -> {
                holder.tvDetalle1.text = "Escuela: ${evento.escuela}"
                holder.tvDetalle2.text = "Ponente: ${evento.ponente}"
            }
            is EncuentroDeportivo -> {
                holder.tvDetalle1.text = "Deporte: ${evento.deporte}"
                holder.tvDetalle2.text = "${evento.equipoA} vs ${evento.equipoB}"
            }
            else -> {
                holder.tvDetalle1.text = ""
                holder.tvDetalle2.text = ""
            }
        }
    }

    override fun getItemCount(): Int = listaEventos.size

    fun actualizarLista(nuevaLista: List<Evento>) {
        listaEventos = nuevaLista
        notifyDataSetChanged()
    }
}


