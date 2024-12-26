package com.github.fireheart071;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency implements Rentable {
    private List<Vehicle> vehicles = new ArrayList<>();
    private List<RentalTransaction> transactions = new ArrayList<>();

    
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public boolean isAvailable(String vehicleId) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleId().equals(vehicleId)) {
                return vehicle.isAvailableForRental();
            }
        }
        return false;
    }

    @Override
    public void rent(Customer customer, int days) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isAvailableForRental()) {
                vehicle.setAvailable(false); // Mark as rented
                RentalTransaction transaction = new RentalTransaction(vehicle, customer, days);
                transactions.add(transaction);
                customer.addRentalTransaction(transaction);
                System.out.println("Rented " + vehicle.getModel() + " for " + days + " days. Total cost: $" + transaction.calculateTotalCost());
                return;
            }
        }
        System.out.println("No vehicles available for rent.");
    }

    @Override
    public void returnVehicle(String vehicleId) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleId().equals(vehicleId)) {
                vehicle.setAvailable(true); // Mark as available
                System.out.println("Vehicle " + vehicleId + " returned successfully.");
                return;
            }
        }
        System.out.println("Vehicle not found.");
    }

    public void liveRentalSummaryReport() {
        System.out.println("\n--- Rental Summary Report ---");
        boolean isAvailable = false; // Flag to check if there are rented vehicles
    
        for (Vehicle vehicle : vehicles) {
            if (!vehicle.isAvailable()) { // Check if the vehicle is rented
                isAvailable = true; // Set the flag to true
                System.out.println("Vehicle ID: " + vehicle.getVehicleId() + ", Model: " + vehicle.getModel() + ", isAvailable: " + vehicle.isAvailable());
            }
        }
    
        if (!isAvailable) {
            System.out.println("No vehicles are currently rented.");
        }
    }
}