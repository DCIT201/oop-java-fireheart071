# Vehicle Rental Management System

This project demonstrates **Object-Oriented Programming (OOP)** principles in Java, focused on creating a **Vehicle Rental Management System**. The system manages vehicle rentals, customer details, and rental transactions, leveraging core OOP principles such as **Abstraction**, **Encapsulation**, **Inheritance**, **Polymorphism**, and **Composition**.

## Features

- **Vehicle Types**: Includes `Car`, `Motorcycle`, and `Truck`, each with unique rental rates, rules, and availability logic.
- **Customer Management**: Handles customer details and rental history.
- **Rental Agency**: Manages the fleet of vehicles, rental transactions, and rental reports.
- **Flexible Rentals**: Implements the `Rentable` interface for renting and returning vehicles.

## OOP Principles Demonstrated

1. **Abstraction**: The system uses abstract classes (e.g., `Vehicle`) to hide complex details and provide clear, simple interfaces.
2. **Encapsulation**: Critical data is kept private within the classes, with controlled access through public getters and setters.
3. **Inheritance**: The system leverages class hierarchies, such as `Car`, `Motorcycle`, and `Truck`, which extend the `Vehicle` class.
4. **Polymorphism**: Method overriding and interfaces like `Rentable` provide flexible and reusable design.
5. **Composition**: Classes like `RentalAgency` and `Customer` contain objects of other classes, demonstrating composition over inheritance.

## Setup

### 1. Clone the repository:
```bash
git clone https://github.com/DCIT201/oop-java-fireheart071.git
cd oop-java-fireheart071

### Build the project
mvn clean install

### Run Tests with JUnit4.11
mvn test
