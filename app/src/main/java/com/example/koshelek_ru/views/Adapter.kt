package com.example.koshelek_ru.views

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.koshelek_ru.R
import com.example.koshelek_ru.network.Post
import retrofit2.Call

class Adapter(var items: List<Post>) :

    RecyclerView.Adapter<Adapter.MainHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MainHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.card_item, parent, false)
    )

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        holder.bind(items[position])
    }

    inner class MainHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val message = itemView.findViewById<TextView>(R.id.breeds_item)
        private val status = String

        fun bind(item: Post) {
            message.text = item.message.toString()
        }
    }
}