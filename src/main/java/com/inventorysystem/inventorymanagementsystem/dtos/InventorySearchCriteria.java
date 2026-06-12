package com.inventorysystem.inventorymanagementsystem.dtos;

import java.time.LocalDateTime;

public class InventorySearchCriteria {

    private Long categoryId;
    private Long supplierId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private int pageNumber;
    private int pageSize;
}
