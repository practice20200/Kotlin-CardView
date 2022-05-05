package com.test.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class CardAdapter (private val books: List<Book>, private val clickListner: BookClickListner)
    : RecyclerView.Adapter<CardViewholder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewholder {
        val from = LayoutInflater.from(parent.context)
        val binding = CardCellBinding.inflate(from,parent, false)
        return CardViewholder(binding, clickListner)
    }

    override fun onBindViewHolder(holder: CardViewholder, position: Int) {
        holder.bindBook(books[position])
    }

    override fun getItemCount(): Int = books.size
}