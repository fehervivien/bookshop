package com.example.bookshop.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookshop.entity.Book;

/*
   A BookRepository egy interfész, amely az adatbázisban tárolt könyvek 
   (Book entitások) kezelésére szolgál. Ez az interfész nem tartalmaz 
   saját metódusokat, hanem örökli a JpaRepository összes funkcióját. 
   A Spring magától írja meg.
*/

public interface BookRepository extends JpaRepository<Book, Long> {
    // További egyedi lekérdezésekhez lehetőségek
}
