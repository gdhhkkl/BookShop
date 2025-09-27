package org.example.bookshop.book.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Book {
    @Id
    private Long id;

    private String title;

    private String author;

    private String publisher;

    private Date pub_date;

    private String isbn13;

    private String cover_url;

    private String category;

    @Column(columnDefinition = "TEXT")
    private String description;


}
