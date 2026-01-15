# First Rest Spring – Products API

This project is a simple REST API built with Spring Boot. It manages Product objects using HTTP methods.

Base URL: http://localhost:8080

# Product Model

A product has:
- id (long)
- name (String)

Example JSON:

{
  "id": 1,
  "name": "Laptop"
}

# Endpoints

Get product by id (/api/v1/products/{id})
Create a product  (/api/v1/products)
Update a product (/api/v1/products/{id})
Delete a product (/api/v1/products/{id})
Find all products (/api/v1/products)


# How to Run
Open the project in IntelliJ
Run FirstRestSpringApplication
Use Swagger to test endpoints: http://localhost:8080/swagger-ui/index.html
