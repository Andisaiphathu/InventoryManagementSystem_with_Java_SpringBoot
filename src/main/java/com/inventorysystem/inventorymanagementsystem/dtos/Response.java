package com.inventorysystem.inventorymanagementsystem.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.inventorysystem.inventorymanagementsystem.enums.UserRole;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)

public class Response {
    //for generic
    private int status;

    private String message;

    //for login
    private String token;

    private UserRole role;

    private String expirationTime;

    //for pagination

    private int totalPages;

    private Long totalElements;
}