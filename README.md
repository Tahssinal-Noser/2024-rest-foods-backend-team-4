# 2024-rest-foods-backend-team-4


## Overview

This project is a backend application for managing a restaurant's operations, built using Spring Boot. The application provides functionalities to manage users, roles, authorities, menu items, and reservations. It also includes security features for user authentication and authorization.

## Features

- **User Authentication and Authorization**: Secure login and role-based access control.
- **CRUD Operations**: Manage users, roles, authorities, menu items, and reservations.
- **Database Integration**: Uses PostgreSQL for data persistence.
- **CORS Configuration**: Allows cross-origin requests from the frontend application.
- **RESTful API**: Provides endpoints for various operations.

## Technologies Used

- **Spring Boot**: For building the backend application.
- **Spring Data JPA**: For database operations.
- **Spring Security**: For securing the application.
- **PostgreSQL**: As the database.
- **Lombok**: To reduce boilerplate code.
- **Gradle**: For build and dependency management.

## Project Structure

src <br>
└── main <br>
└── java <br>
└── ch <br>
└── noseryoung <br>
└── rest_food <br>
├── RestFoodApplication.java <br>
├── security <br>
│ └── WebSecurityConfig.java <br>
├── domain <br>
│ └── authority <br>
│ ├── Authority.java <br>
│ └── AuthorityRepository.java <br>
│ └── menucard <br>
│ ├── Menucard.java <br>
│ ├── MenucardController.java <br>
│ ├── MenucardRepository.java <br>
│ ├── MenucardService.java <br>
│ └── menucarditem <br>
│ ├── MenucardItem.java <br>
│ ├── MenucardItemController.java <br>
│ ├── MenucardItemRepository.java <br>
│ └── MenucardItemService.java <br>
│ └── reservation <br>
│ ├── Reservation.java <br>
│ ├── ReservationController.java <br>
│ ├── ReservationRepository.java <br>
│ └── ReservationService.java <br>
│ └── table <br>
│ ├── RestaurantTable.java <br>
│ ├── RestaurantTableController.java <br>
│ ├── RestaurantTableRepository.java <br>
│ └── RestaurantTableService.java <br>
│ └── role <br>
│ ├── Role.java <br>
│ └── RoleRepository.java <br>
│ └── user <br>
│ ├── User.java <br>
│ ├── UserRepository.java <br>
│ ├── UserService.java <br>
│ └── GlobalExceptionHandler.java <br>


## Setup and Installation

1. **Clone the Repository**

   ```bash
   git clone https://github.com/yourusername/restaurant-management-backend.git
   cd restaurant-management-backend
2. **Configure Postgresql Database**
   ```bash
   spring.datasource.url=jdbc:postgresql://localhost:5432/yourdatabase
   spring.datasource.username=yourusername
   spring.datasource.password=yourpassword
   spring.jpa.hibernate.ddl-auto=update
3. **Build the Project**
   ```bash
   ./gradlew build
4. **Run the Application**
   ```bash
   ./gradlew bootRun

