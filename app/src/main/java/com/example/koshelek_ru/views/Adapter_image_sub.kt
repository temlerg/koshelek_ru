package com.example.koshelek_ru.views

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.koshelek_ru.R
import com.example.koshelek_ru.fragment.Image_sub

class Adapter_image_sub(var items: List<String>, val context: Image_sub) :
    RecyclerView.Adapter<Adapter_image_sub.MainHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MainHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.card_item_image, parent, false)
    )

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        var b = true

        holder.bind(items[position])
        holder.itemView.setOnClickListener {
            val like = holder.itemView.findViewById<ImageView>(R.id.like)
            like.setImageResource(R.drawable.ic_outline_favorite_24)
            if (!b) {
                like.setImageResource(R.drawable.ic_baseline_favorite_border_24)
                b = true
            }else{
                like.setImageResource(R.drawable.ic_outline_favorite_24)
                b = false
            }

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