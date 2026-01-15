# First Rest Spring - Products API

This project is a Spring Boot REST API that manages `Product` objects.
It demonstrates REST architecture, HTTP methods, layers (Controller, Service, Repository),
custom exceptions, and global exception handling.

Base URL: http://localhost:8080

# How to Run

1. Open the project in IntelliJ IDEA.
2. Run the main class: FirstRestSpringApplication
3.  Open Swagger UI in browser: http://localhost:8080/swagger-ui.html

All endpoints will be visible and testable from Swagger.


# Product Model

A product contains:

- `id` - long  
- `name` - String  


# Endpoints
| Method | URL            | Description             |
| ------ | -------------- | ----------------------- |
| GET    | /products      | Get all products        |
| GET    | /products/{id} | Get product by id       |
| POST   | /products      | Create a new product    |
| PUT    | /products/{id} | Update existing product |
| DELETE | /products/{id} | Delete product          |

<img width="625" height="338" alt="image" src="https://github.com/user-attachments/assets/3465f6c4-990e-4fa6-98bd-93eb99d498fb" />

# Create
First product:
<img width="701" height="379" alt="image" src="https://github.com/user-attachments/assets/53c08aad-2f46-4f75-8730-a42f0b5df61c" />

Second product:
<img width="715" height="424" alt="image" src="https://github.com/user-attachments/assets/fa5ad9d4-1303-4398-a666-a844cdf3e487" />

# Get all products
<img width="718" height="401" alt="image" src="https://github.com/user-attachments/assets/5798a55a-b4fa-4f1a-a9dc-ba367b745e55" />

# Get product by id

First product:
<img width="715" height="364" alt="image" src="https://github.com/user-attachments/assets/4baaec14-5a41-48f7-b923-05f6a02360ca" />

Second product:
<img width="715" height="371" alt="image" src="https://github.com/user-attachments/assets/d3c5f4b2-6bd3-4992-8499-fd11f124707d" />


# Update product

First product update:
<img width="704" height="414" alt="image" src="https://github.com/user-attachments/assets/7da0e156-c727-425e-ba4e-865531b28e37" />

All products after update:
<img width="711" height="407" alt="image" src="https://github.com/user-attachments/assets/b5a1ab9d-0080-41c0-a33f-55525cf3d073" />


# Delete product

Delete second product:
<img width="728" height="417" alt="image" src="https://github.com/user-attachments/assets/82a3f701-c0c2-4ffc-af25-30a53ec6f6c0" />

All products after delete:
<img width="713" height="393" alt="image" src="https://github.com/user-attachments/assets/2e3319a9-d8c8-47f4-bca9-a52937c0ebce" />

# Product not found
<img width="699" height="389" alt="image" src="https://github.com/user-attachments/assets/52edde5f-c5c2-48eb-95ef-708a2761bc23" />







