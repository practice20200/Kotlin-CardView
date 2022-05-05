package com.test.myapplication

var bookList = mutableListOf<Book>()
var Book_ID_EXTRA = "bookExtra1"

class Book {
    var cover: Int,
    var author: String,
    var title: String,
    var description: String,
    var id: Int? = bookList.size
}
