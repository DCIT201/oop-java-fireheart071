package com.github.fireheart071;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a rental agency that manages a fleet of vehicles and handles rental transactions.
 * This class implements the Rentable interface, allowing vehicles to be rented and returned.
 * The agency also keeps track of the vehicles available for rental and generates rental summary reports.
 */
public class RentalAgency implements Rentable {
    private List<Vehicle> vehicles = new ArrayList<>();  // List of vehicles in the rental fleet
    private List<RentalTransaction> transactions = new ArrayList<>();  // List of all rental transactions

    /**
     * Adds a vehicle to the rental agency's fleet.
     * 
     * @param vehicle The vehicle to be added to the fleet.
     */
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);  // Adds the vehicle to the list of vehicles in the fleet
    }

    /**
     * Checks if a vehicle with the given ID is available for rental.
     * 
     * @param vehicleId The ID of the vehicle to check.
     * @return true if the vehicle is available for rental, false otherwise.
     */
    public boolean isAvailable(String vehicleId) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleId().equals(vehicleId)) {
                return vehicle.isAvailableForRental();  // Checks availability based on the vehicle's status
            }
        }
        return false;  // If the vehicle is not found, it is considered unavailable
    }

    /**
     * Rents a vehicle to a customer for a specified number of days.
     * The method marks the vehicle as rented and creates a rental transaction.
     * 
     * @param customer The customer renting the vehicle.
     * @param days The number of days the vehicle is being rented for.
     */
    @Override
    public void rent(Customer customer, int days) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isAvailableForRental()) {
                vehicle.setAvailable(false);  // Marks the vehicle as rented
                RentalTransaction transaction = new RentalTransaction(vehicle, customer, days);
                transactions.add(transaction);  // Adds the transaction to the list of all rentals
                customer.addRentalTransaction(transaction);  // Adds the transaction to the customer's rental history
                System.out.println("Rented " + vehicle.getModel() + " for " + days + " days. Total cost: $" + transaction.calculateTotalCost());
                return;
            }
        }
        System.out.println("No vehicles available for rent.");  // If no vehicle is available, displays a message
    }

    /**
     * Returns a rented vehicle, making it available for future rentals.
     * 
     * @param vehicleId The ID of the vehicle being returned.
     */
    @Override
    public void returnVehicle(String vehicleId) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleId().equals(vehicleId)) {
                vehicle.setAvailable(true);  // Marks the vehicle as available again
                System.out.println("Vehicle " + vehicleId + " returned successfully.");
                return;
            }
        }
        System.out.println("Vehicle not found.");  // If the vehicle is not found, displays an error message
    }

    /**
     * Generates a live rental summary report that lists all rented vehicles and their details.
     * The report shows the ID, model, and availability status of all rented vehicles.
     */
    public void liveRentalSummaryReport() {
        System.out.println("\n--- Rental Summary Report ---");
        boolean isAvailable = false;  // Flag to check if there are rented vehicles
    
        for (Vehicle vehicle : vehicles) {
            if (!vehicle.isAvailable()) {  // Checks if the vehicle is rented
                isAvailable = true;  // Sets the flag to true if a rented vehicle is found
                System.out.println("Vehicle ID: " + vehicle.getVehicleId() + ", Model: " + vehicle.getModel() + ", isAvailable: " + vehicle.isAvailable());
            }
        }
    
        if (!isAvailable) {
            System.out.println("No vehicles are currently rented.");  // If no rented vehicles are found, display a message
        }
    }
}
