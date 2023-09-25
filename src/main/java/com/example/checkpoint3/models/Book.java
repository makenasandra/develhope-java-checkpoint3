package com.example.checkpoint3.models;

import jakarta.persistence.Entity;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Entity
@Data
public class Book {
    @jakarta.persistence.Id
    @Id
    private Long id;
    private String title;
    private String author;
    private String isbn;
    private int copiesAvailable;
    // getters and setters

    public Book(){}

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}