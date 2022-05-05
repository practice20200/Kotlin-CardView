package com.test.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DetailActivity : AppCompatActivity() {

//    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_detail)

        val bookID = intent.getInExtra(Book_ID_EXTRA,-1)
        val book = bookFromID(bookID)
        if(book != null){
            binding.cover.setImageResource(book.cover)
            binding.title.text = book.title
            binding.description.text = book.description
            binding.autor.text = book.author
        }
    }
}