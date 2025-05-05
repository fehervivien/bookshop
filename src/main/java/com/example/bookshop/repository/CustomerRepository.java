package com.example.bookshop.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookshop.entity.Customer;
import org.springframework.stereotype.Repository;

/* 
    A CustomerRepository.java interfész a vásárlók kezelésére szolgál, 
    és örökli a JpaRepository összes CRUD funkcióját (ugyanúgy, mint a BookRepository) 
*/
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Vásárló keresése email cím alapján
    Optional<Customer> findByEmail(String email); 
}

