package com.example.bookshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.bookshop.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    // További egyedi lekérdezésekhez lehetőségek
}
