

# Enterprise Inventory Management System

## Overview

The Enterprise Inventory Management System is a full-stack inventory management application designed to help businesses efficiently manage products, suppliers, stock levels, sales, and inventory transactions.

The system is being built using Java and Spring Boot following enterprise software development practices, including layered architecture, REST APIs, JWT authentication, automated testing, CI/CD, containerization, and performance testing.

This project serves as both a learning project and a production-style portfolio demonstrating backend engineering, API development, security, DevOps, and software architecture.

---

# System Overview

```
                    React.js Frontend
                           │
                           │ HTTP/HTTPS REST API
                           ▼
               Spring Boot REST API Server
                           │
          ┌────────────────┼────────────────┐
          │                │                │
      Security         Business Logic      Validation
       (JWT)            Services             DTOs
          │                │
          └────────────────┼────────────────┘
                           │
                      Hibernate / JPA
                           │
                      MySQL Database
```

---

# Technology Stack

| Category               | Technology                       |
| ---------------------- | -------------------------------- |
| Language               | Java 21                          |
| Runtime                | JVM                              |
| Backend Framework      | Spring Boot                      |
| Frontend               | React.js                         |
| UI Framework           | Bootstrap                        |
| Database               | MySQL                            |
| ORM                    | Hibernate / Spring Data JPA      |
| Validation             | Jakarta Validation               |
| Object Mapping         | ModelMapper                      |
| Authentication         | Spring Security + JWT            |
| Authorization          | Role-Based Access Control (RBAC) |
| Build Tool             | Gradle                           |
| Version Control        | Git & GitHub                     |
| Continuous Integration | GitHub Actions                   |
| Continuous Deployment  | Jenkins (Planned)                |
| Containerization       | Docker (Planned)                 |
| API Testing            | Postman                          |
| API Documentation      | Swagger OpenAPI (Planned)        |
| Unit Testing           | JUnit 5                          |
| Mocking                | Mockito                          |
| Performance Testing    | Apache JMeter                    |
| IDE                    | IntelliJ IDEA Community Edition  |
| Database Client        | MySQL Workbench                  |

---

# Key Features

## Authentication

* User Registration
* User Login
* JWT Authentication
* Role-Based Access Control
* Password Encryption

---

## Product Management

* Add Product
* Update Product
* Delete Product
* Search Products
* View Product Details

---

## Inventory Management

* Track Stock Levels
* Low Stock Alerts
* Stock Increase
* Stock Deduction
* Inventory Transactions

---

## Supplier Management

* Register Supplier
* Update Supplier
* View Suppliers

---

## Category Management

* Create Categories
* Update Categories
* Product Categorization

---

## Sales

* Record Sales
* Update Inventory Automatically
* Transaction History

---

## Reporting

* Dashboard
* Inventory Summary
* Sales Reports
* Low Stock Report

---

# Project Architecture

The application follows a layered architecture.

```
Client (React.js)
        │
Controllers (REST API)
        │
Services (Business Logic)
        │
Repositories (Spring Data JPA)
        │
MySQL Database
```

---

# PlantUML Diagrams

The repository contains PlantUML diagrams for:

* System Architecture
* Authentication Flow
* Inventory Workflow
* Product Management Workflow
* Sequence Diagrams
* BPMN Business Processes

---

# Quick Start

## Clone Repository

```bash
git clone <repository-url>
```

## Configure Environment Variables

Create a `.env` file.

Example:

```
DB_HOST=
DB_PORT=
DB_NAME=
DB_USERNAME=
DB_PASSWORD=
JWT_SECRET=
JWT_EXPIRATION=
```

---

## Start MySQL

Create the database.

```
inventory_db
```

---

## Run Application

```
./gradlew bootRun
```

The application starts on:

```
http://localhost:8080
```

---

# CI/CD Pipeline

GitHub Actions

* Build Project
* Execute Unit Tests
* Verify Gradle Build

Jenkins (Planned)

* Pull Repository
* Build Docker Image
* Deploy Application

---

# API Endpoints

## Authentication

POST /api/auth/register

POST /api/auth/login

---

## Products

GET /api/products

GET /api/products/{id}

POST /api/products

PUT /api/products/{id}

DELETE /api/products/{id}

---

## Categories

GET /api/categories

POST /api/categories

PUT /api/categories/{id}

DELETE /api/categories/{id}

---

## Suppliers

GET /api/suppliers

POST /api/suppliers

PUT /api/suppliers/{id}

DELETE /api/suppliers/{id}

---

## Inventory

GET /api/inventory

POST /api/inventory/restock

POST /api/inventory/sale

---

# Swagger Documentation

Swagger UI will be available after API implementation.

Example:

```
http://localhost:8080/swagger-ui/index.html
```

---

# Postman Collection

A complete Postman collection will be included in the repository after all REST endpoints are implemented.

---

# Default Administrator

The application seeds a default administrator account during development.

Email:

```
admin@example.com
```

The password is intentionally not published.

---

# Environment Variables

| Variable       | Description          |
| -------------- | -------------------- |
| DB_HOST        | Database Host        |
| DB_PORT        | Database Port        |
| DB_NAME        | Database Name        |
| DB_USERNAME    | Database Username    |
| DB_PASSWORD    | Database Password    |
| JWT_SECRET     | JWT Signing Secret   |
| JWT_EXPIRATION | JWT Token Expiration |

---

# Docker

Docker support will include:

* Dockerfile
* docker-compose.yml
* MySQL Container
* Spring Boot Container

---

# Future Enhancements

* Email Notifications
* Password Reset
* Audit Logging
* Redis Caching
* Kubernetes Deployment
* Monitoring with Prometheus and Grafana
* ELK Logging
* Multi-Tenant Support

---

# License

This project is intended for educational and portfolio purposes.
