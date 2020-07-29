package com.example.koshelek_ru.views

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.koshelek_ru.DB.Like_DB
import com.example.koshelek_ru.R
import com.example.koshelek_ru.models.List_DB

class Adapter_like(var items: List<Like_DB>, var listener: (String) -> Unit) :
    RecyclerView.Adapter<Adapter_like.MainHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MainHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.card_item_like, parent, false)
    )

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        holder.bind(items[position])
        holder.itemView.setOnClickListener {
            listener.invoke(items[position].im)
        }
    }

    inner class MainHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val message = itemView.findViewById<TextView>(R.id.breeds_item_like)

        @SuppressLint("SetTextI18n")
        fun bind(item: Like_DB) {
            message.text = item.breed_like + "(${item.size} photo)"
        }
    }
}