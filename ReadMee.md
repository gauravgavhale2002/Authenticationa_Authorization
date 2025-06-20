readme_content = """
# Spring Boot Authentication & Authorization (Without JWT)

This project demonstrates how to implement **Authentication** and **Role-Based Authorization** in Spring Boot using Spring Security (without JWT).

---

## 📦 Project Setup

Generated using [Spring Initializr](https://start.spring.io/):

- **Project**: Maven
- **Language**: Java
- **Spring Boot**: 3.2.x
- **Group**: com.auth
- **Artifact**: authapi
- **Dependencies**:
    - Spring Web
    - Spring Security
    - Spring Data JPA
    - MySQL Driver
    - Lombok (optional)

---

## 🗂️ Package Structure

## 🗂️ Package Structure

com.auth.authapi
├── config/
│ └── SecurityConfig.java
├── controller/
│ ├── AuthController.java
│ └── RoleTestController.java
├── model/
│ └── User.java
├── repository/
│ └── UserRepository.java
├── service/
│ └── AuthService.java
└── AuthApiApplication.java

---

## 🔐 Authentication Flow

- **Register**: `/api/auth/register` (POST)
- **Login**: `/api/auth/login` (POST)
- Passwords are encrypted using BCrypt.
- If credentials are valid: 200 OK
- If invalid: 401 Unauthorized

---


## ✅ Role-Based Authorization

| Endpoint              | Role Required |
|-----------------------|---------------|
| `/api/user/data`      | `USER`        |
| `/api/admin/data`     | `ADMIN`       |

Roles are assigned at registration time and verified using `hasRole(...)` in `SecurityConfig.java`.

---


## 🧪 Postman Testing

### 1. Register User
POST http://localhost:8080/api/auth/register
Headers:
Content-Type: application/json

Body:
{
"username": "gaurav",
"password": "pass123",
"confirmPassword": "pass123",
"role": "USER"
}


### 2. Login
POST http://localhost:8080/api/auth/login
Headers:
Content-Type: application/json

Body:
{
"username": "gaurav",
"password": "pass123"
}

shell
### 3. Access Authorized Endpoint
GET http://localhost:8080/api/user/data
Auth Type: Basic Auth
Username: gaurav
Password: pass123

yaml
Always show details

Copy

---


## 🧾 Expected Responses

| Scenario              | Response Status | Message                                |
|-----------------------|-----------------|----------------------------------------|
| Valid login           | 200 OK          | Login successful                       |
| Invalid credentials   | 401 Unauthorized| Invalid username or password           |
| Access with wrong role| 403 Forbidden   | Access Denied                          |

---


## 📘 PDF Guide

You can also refer to [`Authentication_Authorization_Guide.pdf`](Authentication_Authorization_Guide.pdf) for a full walkthrough.
"""

readme_path = "/mnt/data/README.md"
with open(readme_path, "w") as file:
file.write(readme_content)

readme_path