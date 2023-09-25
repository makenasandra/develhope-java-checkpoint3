package com.example.checkpoint3.repository;

import com.example.checkpoint3.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepo extends JpaRepository<Book, Long>{
    Book getBooksById(long id);

}
