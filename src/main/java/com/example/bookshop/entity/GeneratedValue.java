package com.example.bookshop.entity;

import jakarta.persistence.GenerationType;

public @interface GeneratedValue {

    public GenerationType strategy();

}
