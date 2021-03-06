package com.example.koshelek_ru.views

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.koshelek_ru.R

class Adapter(var items: List<String>, val listener: (String) -> Unit) :
    RecyclerView.Adapter<Adapter.MainHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MainHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.card_item, parent, false)
    )

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        holder.bind(items[position])
        holder.itemView.setOnClickListener {
            listener.invoke(items[position])
        }
    }

    inner class MainHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val message = itemView.findViewById<TextView>(R.id.breeds_item)

        fun bind(item: String) {
            message.text = item
        }
    }
}