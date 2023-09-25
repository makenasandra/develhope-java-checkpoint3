package com.example.checkpoint3.services;

import com.example.checkpoint3.models.Book;

import java.util.List;

public interface BookServiceInterface {
    Book addBook(Book book);
    List<Book> getAllBooks();

    Book getBook(long bookId);

    Book updateBook(long bookId, Book book);

    void deleteBook(long bookId);

}
