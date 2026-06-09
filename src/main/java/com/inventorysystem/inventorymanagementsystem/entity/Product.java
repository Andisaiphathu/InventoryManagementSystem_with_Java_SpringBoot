package com.inventorysystem.inventorymanagementsystem.entity;

import jakarta.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productCategory;
    private String name;
    private double price;
    private int quantity;
    private long maximumProducts;
    private long minimumProducts;

    // getters and setters (important later)
}