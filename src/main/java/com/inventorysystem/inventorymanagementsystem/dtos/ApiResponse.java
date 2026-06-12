package com.inventorysystem.inventorymanagementsystem.dtos;

import lombok.Data;

@Data
public class ApiResponse<T> {

    private int status;
    private String message;
    private T data; // Holds your specific DTO

    // Getters and Setters
}
