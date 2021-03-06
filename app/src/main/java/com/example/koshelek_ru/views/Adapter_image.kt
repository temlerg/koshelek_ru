package com.example.koshelek_ru.views

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.koshelek_ru.App
import com.example.koshelek_ru.DB.AppDatabase
import com.example.koshelek_ru.R
import com.example.koshelek_ru.fragment.Image


class Adapter_image(var items: List<String>, val context: Image, val listener: (String) -> Unit) :
    RecyclerView.Adapter<Adapter_image.MainHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MainHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.card_item_image, parent, false)
    )


    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: MainHolder, position: Int) {

        holder.bind(items[position])
        holder.itemView.setOnClickListener {
            val like = holder.itemView.findViewById<ImageView>(R.id.like)
                like.setImageResource(R.drawable.ic_outline_favorite_24)
            listener.invoke(items[position])
        }
    }

    inner class MainHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val message = itemView.findViewById<ImageView>(R.id.image)
        private val status = String

        fun bind(item: String) {
            Glide
                .with(context)
                .load(item)
                .into(message);
        }
    }
}