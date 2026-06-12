package com.inventorysystem.inventorymanagementsystem.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)

public class ProductDTO {

    private Long id;

    private Long categoryId;

    private Long supplierId;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "SKU is required")
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


    private LocalDateTime createdAt;

    //private CategoryDTO category;
    }
