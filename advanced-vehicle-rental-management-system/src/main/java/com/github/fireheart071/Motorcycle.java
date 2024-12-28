package com.github.fireheart071;

/**
 * Represents a motorcycle in the vehicle rental system.
 * This class extends the abstract class Vehicle and provides specific implementation for motorcycle rental calculation.
 * The rental cost is calculated based on the base rental rate and the number of days rented.
 * The motorcycle availability is determined based on the vehicle's availability status.
 */
public class Motorcycle extends Vehicle {

    /**
     * Constructor to create a Motorcycle object.
     * Initializes the motorcycle's ID, model, base rental rate, and availability status.
     *
     * @param vehicleId The unique ID for this motorcycle.
     * @param model The model of the motorcycle.
     * @param baseRentalRate The base rate for renting the motorcycle.
     * @param isAvailable The availability status of the motorcycle (true if available, false otherwise).
     */
    public Motorcycle(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        super(vehicleId, model, baseRentalRate, isAvailable);
    }

    /**
     * Calculates the rental cost for this motorcycle.
     * The rental cost is calculated by multiplying the base rental rate by the number of days rented.
     *
     * @param days The number of days the motorcycle is being rented.
     * @return The total rental cost for the motorcycle.
     */
    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days;  // Rental cost is based on the base rate per day.
    }

    /**
     * Checks if the motorcycle is available for rental.
     * This method checks the availability status inherited from the Vehicle class.
     *
     * @return true if the motorcycle is available for rental, false otherwise.
     */
    @Override
    public boolean isAvailableForRental() {
        return isAvailable();  // Returns the availability status from the Vehicle class.
    }

    /**
     * Provides a string representation of the Motorcycle object.
     * This includes the vehicle ID and the model of the motorcycle.
     *
     * @return A string representing the motorcycle's details.
     */
    @Override
    public String toString() {
        return "Motorcycle{" + "vehicleId='" + getVehicleId() + '\'' + ", model='" + getModel() + '\'' + '}';
    }
}
