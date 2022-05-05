package com.test.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager

class MainActivity : AppCompatActivity(), BookClickListner {
    private lateinit var binding: ActivityMainBinding
    override fun  onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setContentView(R.layout.activity_main)

        popularBooks()

        val mainActivity = this
        binding.recycleView.apply{
            layoutManager = GridLayoutManager(applicationContext,3)
            adaptor = CardAdapter(bookList, mainActivity)
        }
    }

    override  fun onClick(book: Book){
        val intent = intent(applicationContext, DetailActivity:: class.java){
            intent.putExtra(Book_ID_EXTRA, book.id)
            startActivity(intent)
        }
    }

    private fun popularBooks(){
        val book1 = Book(R.drawable.Building, "1","11","111")
        bookList.add(book1)

        val book2 = Book(R.drawable.Building, "2", "22", "222")
        bookList.add(book2)
    }
}