package com.inventorysystem.inventorymanagementsystem.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.inventorysystem.inventorymanagementsystem.enums.UserRole;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)

public class TransactionRequest {

    @NotBlank(message = "Product id is required")
    private String productId;

    @NotBlank(message = "Quantity id is required")
    private String quantity;

    private String supplierId;

    private String description;

    private String note;
}
