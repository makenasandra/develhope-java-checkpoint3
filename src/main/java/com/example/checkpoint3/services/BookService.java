package com.example.checkpoint3.services;

import com.example.checkpoint3.models.Book;
import com.example.checkpoint3.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookService implements BookServiceInterface{
    BookRepo bookRepo;

    @Autowired
    public BookService (BookRepo bookRepo){
        this.bookRepo = bookRepo;
    }
    @Override
    public Book addBook(Book book) {
        bookRepo.save(book);
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    @Override
    public Book getBook(long bookId) {
        return bookRepo.getBooksById(bookId);
    }

    @Override
    public Book updateBook(long bookId, Book book) {
        Book bookToUpdate = bookRepo.getBooksById(bookId);

        if(bookToUpdate == null){
            return null;
        }

        bookRepo.save(book);
        return book;
    }

    @Override
    public void deleteBook(long bookId) {

    bookRepo.deleteById(bookId);
    }
}
