package com.example.appingeweek.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.appingeweek.R

class UbicacionAdapter(
    private val context: Context,
    private val lugares: List<String>,
    private val imagenes: List<Int>
) : BaseAdapter() {

    override fun getCount(): Int = lugares.size

    override fun getItem(position: Int): Any = lugares[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context)
            .inflate(R.layout.item_ubicacion, parent, false)

        val tvLugar = view.findViewById<TextView>(R.id.tvLugar)
        val imgUbicacion = view.findViewById<ImageView>(R.id.imgUbicacion)

        tvLugar.text = lugares[position]
        imgUbicacion.setImageResource(imagenes[position])

        return view
    }
}
