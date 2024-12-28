package com.github.fireheart071;

/**
 * Represents a car in the vehicle rental system.
 * This class extends the abstract class Vehicle and provides specific implementation for car rental calculation.
 * The rental cost is calculated based on the base rental rate and the number of days rented.
 * The car availability is determined based on the vehicle's availability status.
 */
public class Car extends Vehicle {

    /**
     * Constructor to create a Car object.
     * This constructor initializes the vehicle's ID, model, base rental rate, and availability status.
     *
     * @param vehicleId The unique ID for this vehicle.
     * @param model The model of the car.
     * @param baseRentalRate The base rate for renting the car.
     * @param isAvailable The availability status of the car (true if available, false otherwise).
     */
    public Car(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        super(vehicleId, model, baseRentalRate, isAvailable);
    }

    /**
     * Calculates the rental cost for this car.
     * The rental cost is calculated by multiplying the base rental rate by the number of days rented.
     *
     * @param days The number of days the car is being rented.
     * @return The total rental cost for the car.
     */
    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days;  // Rental cost is based on the base rate per day.
    }

    /**
     * Checks if the car is available for rental.
     * This method checks the availability status inherited from the Vehicle class.
     *
     * @return true if the car is available for rental, false otherwise.
     */
    @Override
    public boolean isAvailableForRental() {
        return isAvailable();  // Returns the availability status from the Vehicle class.
    }

    /**
     * Provides a string representation of the Car object.
     * This includes the vehicle ID and the model of the car.
     *
     * @return A string representing the car's details.
     */
    @Override
    public String toString() {
        return "Car{" + "vehicleId='" + getVehicleId() + '\'' + ", model='" + getModel() + '\'' + '}';
    }
}
