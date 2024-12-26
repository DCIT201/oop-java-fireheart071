package com.github.fireheart071;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RentalAgency rentalAgency = new RentalAgency();

        // Add vehicles to the rental agency
        rentalAgency.addVehicle(new Car("C001", "Toyota Camry", 35, true));
        rentalAgency.addVehicle(new Motorcycle("M001", "Harley Davidson", 30, true));
        rentalAgency.addVehicle(new Truck("T001", "Ford F-150", 40, true));

        // Main menu loop
        while (true) {
            System.out.println("\n--- Vehicle Rental Management System ---");
            System.out.println("1. Rent a Vehicle");
            System.out.println("2. Return a Vehicle");
            System.out.println("3. View Rental Summary");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Rent a vehicle
                    System.out.print("Enter customer name: ");
                    String name = scanner.next();
                    System.out.print("Enter customer age: ");
                    int age = scanner.nextInt();
                    System.out.print("Does the customer have a driving license? (true/false): ");
                    boolean hasLicense = scanner.nextBoolean();
                    System.out.print("Enter customer phone number: ");
                    String phoneNumber = scanner.next();

                    Customer customer = new Customer(name, age, hasLicense, phoneNumber);

                    System.out.print("Enter vehicle ID to rent: ");
                    scanner.next();
                    System.out.print("Enter number of rental days: ");
                    int rentalDays = scanner.nextInt();

                    rentalAgency.rent(customer, rentalDays);
                    break;

                case 2:
                    // Return a vehicle
                    System.out.print("Enter vehicle ID to return: ");
                    String returnVehicleId = scanner.next();
                    rentalAgency.returnVehicle(returnVehicleId);
                    break;

                case 3:
                    // View rental summary
                    rentalAgency.liveRentalSummaryReport();
                    break;

                case 4:
                    // Exit the application
                    System.out.println("Exiting the system. Thank you!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}