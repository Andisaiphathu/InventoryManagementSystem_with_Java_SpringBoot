package com.inventorysystem.inventorymanagementsystem.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
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

public class SupplierDTO {

    private Long id;

    @NotBlank(message = "name is required")
    private String name;

    @NotBlank(message = "Contact details are required")
    private String contactInfo;

    private String address;

    private LocalDateTime createdAt;

    //private List<ProductDTO> products;

}
