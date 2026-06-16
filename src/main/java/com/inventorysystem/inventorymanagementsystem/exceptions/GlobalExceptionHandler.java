package com.inventorysystem.inventorymanagementsystem.exceptions;

import com.inventorysystem.inventorymanagementsystem.dtos.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    // Core Fallback for Unexpected System Errors
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse<Object>> handleAllExceptions(Exception ex) {
        log.error("Unexpected error", ex);

        return buildResponse(HttpStatus.INTERNAL_SERVER_ERROR,
                "An unexpected error occurred. Please try again later.",
                null);
    }

    // Resource Not Found Handler
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ApiResponse<Object>> handleNotFoundException(NotFoundException ex) {
        return buildResponse(HttpStatus.NOT_FOUND, ex.getMessage(), null);
    }

    // Consolidated Client Error Handler (Scales easily for new 400 Bad Request errors)
    @ExceptionHandler({
            NameValueRequiredException.class,
            InvalidCredentialsException.class
    })
    public ResponseEntity<ApiResponse<Object>> handleBadRequestExceptions(RuntimeException ex) {
        return buildResponse(HttpStatus.BAD_REQUEST, ex.getMessage(), null);
    }

    // Spring Validation Error Handler (Crucial for scaling input forms)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiResponse<Object>> handleValidationExceptions(MethodArgumentNotValidException ex) {

        // Collects validation errors into a clean, distinct list instead of a messy comma-separated string
        String errorMessages = ex.getBindingResult().getFieldErrors().stream()
                .map(error -> String.format("'%s' %s", error.getField(), error.getDefaultMessage()))
                .collect(Collectors.joining("; "));

        return buildResponse(HttpStatus.BAD_REQUEST, String.join(", ", errorMessages), null);
    }

    // Request Parameter Handler
    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ResponseEntity<ApiResponse<Object>> handleMissingParams(MissingServletRequestParameterException ex) {
        String error = ex.getParameterName() + " parameter is missing";
        return buildResponse(HttpStatus.BAD_REQUEST, error, null);
    }

    // DRY Helper method to quickly generate responses
    private ResponseEntity<ApiResponse<Object>> buildResponse(HttpStatus status, String message, Object data) {

        ApiResponse<Object> response = new ApiResponse<>();
        response.setStatus(status.value());
        response.setMessage(message);
        response.setData(data);

        return new ResponseEntity<>(response, status);
    }
}

