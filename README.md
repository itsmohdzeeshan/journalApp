# 📔 Journal App

A secure backend application built with Spring Boot that allows users to create and manage personal journal entries.

The application implements authentication and authorization using JWT, ensuring secure access to user-specific journal data.

## 🚀 Features

### Authentication & Security

* JWT-based Authentication
* User Registration
* User Login
* Password Encryption
* Role-Based Authorization
* Protected REST APIs

### Journal Management

* Create Journal Entries
* Read Journal Entries
* Update Journal Entries
* Delete Journal Entries
* User-specific Journals

### Database

* MongoDB Atlas Integration
* User Collection
* Journal Entries Collection
* Relationship Mapping between Users and Journal Entries

## 🛠 Tech Stack

### Backend

* Java
* Spring Boot
* Spring Security
* JWT Authentication
* Maven

### Database

* MongoDB Atlas

### Tools

* Postman
* Git
* GitHub

## 📂 Project Structure

```text
src
├── controller
├── service
├── repository
├── entity
├── config
├── security
└── util
```

## 🔐 Authentication Flow

1. User registers an account.
2. User logs in with credentials.
3. Server generates a JWT token.
4. Token is used to access protected APIs.
5. Users can only manage their own journal entries.

## ⚡ Getting Started

### Clone Repository

```bash
git clone https://github.com/itsmohdzeeshan/journalApp.git
```

### Navigate to Project

```bash
cd journalApp
```

### Build Project

```bash
mvn clean install
```

### Run Application

```bash
mvn spring-boot:run
```

## 📦 Environment Variables

Configure the following properties:

```properties
spring.data.mongodb.uri=YOUR_MONGODB_URI

jwt.secret=YOUR_SECRET_KEY
```

## 🔗 API Modules

### Authentication

* Register User
* Login User
* Generate JWT Token

### User APIs

* Create User
* Update User
* Delete User
* View User Profile

### Journal APIs

* Create Journal Entry
* Get Journal Entries
* Update Journal Entry
* Delete Journal Entry

## 🎯 Future Enhancements

* React Frontend
* Rich Text Editor
* Search Journal Entries
* Journal Categories
* Tags and Filters
* Image Upload Support
* Cloud Deployment
* Email Verification

## 📈 Learning Outcomes

This project helped me gain practical experience with:

* Spring Boot Architecture
* Spring Security
* JWT Authentication
* REST API Development
* MongoDB Integration
* Backend System Design

## 👨‍💻 Author

Mohd Zeeshan Khan

GitHub: https://github.com/itsmohdzeeshan
