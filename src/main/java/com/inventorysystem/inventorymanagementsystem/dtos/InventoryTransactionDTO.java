package com.inventorysystem.inventorymanagementsystem.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.inventorysystem.inventorymanagementsystem.enums.TransactionStatus;
import com.inventorysystem.inventorymanagementsystem.enums.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)

public class InventoryTransactionDTO {


    private Long id;

    private Long userId;

    private Long productId;

    private Long supplierId;

    private int totalProducts;

    private double totalPrice;

    private TransactionType transactionType;

    private TransactionStatus transactionStatus;

    private String description;

    private String note;


    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
