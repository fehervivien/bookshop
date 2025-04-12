package com.example.bookshop.service;

import java.util.List;

import com.example.bookshop.entity.Order;


public interface OrderService {
    List<Order> findAll();
    Order findById(Long id);
    Order save(Order order);
    void deleteById(Long id);
}

