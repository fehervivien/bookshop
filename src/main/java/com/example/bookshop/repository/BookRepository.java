package com.example.bookshop.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookshop.entity.Book;

/*A BookRepository interfész fogja kezelni az adatbázis műveleteket. 
Ehhez a Spring Data JPA-t fogom használni, ami automatikusan 
implementálja az alapvető CRUD műveleteket. */

public interface BookRepository extends JpaRepository<Book, Long> {
    // További egyedi lekérdezésekhez lehetőségek
}
