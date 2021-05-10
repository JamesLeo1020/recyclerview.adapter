package com.example.myapplication

import android.content.Intent
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var itemKode: TextView
    var itemKategori: TextView
    var itemIsi: TextView

    init {
        itemKode = itemView.findViewById(R.id.kodePertanyaan)
        itemKategori = itemView.findViewById(R.id.kategori)
        itemIsi = itemView.findViewById(R.id.isiPertanyaan)

        itemView.setOnClickListener {
            var position: Int = getAdapterPosition()
            val context = itemView.context
            val intent = Intent(context, DetailPertanyaan::class.java).apply {
                putExtra("NUMBER", position)
                putExtra("CODE", itemKode.text)
                putExtra("CATEGORY", itemKategori.text)
                putExtra("CONTENT", itemIsi.text)
            }
            context.startActivity(intent)
        }
    }
}