package com.inventorysystem.inventorymanagementsystem.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.inventorysystem.inventorymanagementsystem.enums.UserRole;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)

public class UserDTO {


    private Long id;

    @NotBlank(message = "Username is required")
    private String username;

    @NotBlank(message = "Contact details are required")
    private String phoneNumber;

    private UserRole role;

    //private List<InventoryTransactionDTO> transactions;

    private LocalDateTime createdAt;

}
