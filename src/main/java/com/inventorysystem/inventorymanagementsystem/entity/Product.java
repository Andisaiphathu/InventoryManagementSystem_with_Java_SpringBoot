package com.inventorysystem.inventorymanagementsystem.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
@Data
@Builder

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotBlank(message = "Name is required")
    private String name;

    @Column(unique = true, nullable = false, length = 50)
    @NotBlank(message = "Sku is required")
    private String sku;

    @Positive(message = "Price must be greater than 0")
    private double price;

    @PositiveOrZero(message = "Quantity must not be negative")
    private int quantity;

    @PositiveOrZero(message = "maximum products must not be negative")
    private int maximumProducts;

    @PositiveOrZero(message = "minimum products must not be negative")
    private int minimumProducts;

    private String description;

    private LocalDate expiryDate;

    private String imageUrl;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sku='" + sku + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", maximumProducts=" + maximumProducts +
                ", minimumProducts=" + minimumProducts +
                ", description='" + description + '\'' +
                ", expiryDate=" + expiryDate +
                ", imageUrl='" + imageUrl + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}