package com.example.checkpoint3.controllers;

import com.example.checkpoint3.models.Book;
import com.example.checkpoint3.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    BookService bookService;

    @Autowired
    public BookController (BookService bookService){
        this.bookService = bookService;
    }


    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        Book newBook = bookService.addBook(book);
        return ResponseEntity.status(HttpStatus.CREATED).body(newBook);
    }

    @GetMapping
    public ResponseEntity<?> getAllBooks(){
        List<Book> bookList = bookService.getAllBooks();
        return ResponseEntity.ok(bookList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBook(@PathVariable("id") long bookId){
        Book newBook = bookService.getBook(bookId);
        return ResponseEntity.ok(newBook);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateBook(@PathVariable("id") long bookId, @RequestBody Book book){
        Book newBook = bookService.updateBook(bookId, book);
        return ResponseEntity.ok(newBook);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable("id") long bookId){
        bookService.deleteBook(bookId);
        return ResponseEntity.ok().build();
    }
}
