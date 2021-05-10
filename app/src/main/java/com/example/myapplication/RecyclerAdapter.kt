package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

abstract class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private val kode = arrayOf("d116df5",
            "36ffc75", "f5cfe78", "5b87628",
            "db8d14e", "9913dc4", "e120f96",
            "466251b")

    private val kategori = arrayOf("Kekayaan", "Teknologi",
            "Keluarga", "Bisnis",
            "Keluarga", "Hutang",
            "Teknologi", "Pidana")

    private val isi = arrayOf("pertanyaan 9",
            "pertanyaan 11", "pertanyaan 17", "test forum",
            "pertanyaan 12", "pertanyaan 18", "pertanyaan 20",
            "pertanyaan 21")

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.card_pertanyaan, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemKode.text = kode[i]
        viewHolder.itemKategori.text = kategori[i]
        viewHolder.itemIsi.text = isi[i]

    }

    override fun getItemCount(): Int {
        return kode.size
    }
}
