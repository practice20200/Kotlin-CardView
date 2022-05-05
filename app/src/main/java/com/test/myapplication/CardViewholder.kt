package com.test.myapplication

import androidx.recyclerview.widget.RecyclerView


class CardViewholder (
    private val cardCellBinding: CardCellBinding,private val clickListener:BookClickListner) : RecyclerView.ViewHolder(cardCellBinding.root)
//    private val clickListener:BookClickListner

{
    fun bindBook(book: Book){
        cardCellBinding.cover.setImageResource(book.cover)
        cardCellBinding.title.text = book.title
        cardCellBinding.author.text = book.author

        cardCellBinding.cardView.setOnClickListner{
            clickListener.onClick(book)
        }
    }
}