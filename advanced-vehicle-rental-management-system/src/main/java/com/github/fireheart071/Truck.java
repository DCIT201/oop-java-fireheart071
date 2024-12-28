package com.github.fireheart071;

/**
 * Represents a truck vehicle in the vehicle rental system.
 * This class extends the {@link Vehicle} class and implements specific rental cost calculations 
 * and availability checks for truck vehicles.
 * It inherits the core properties of a vehicle and adds specific behavior for rental transactions 
 * involving trucks.
 */
public class Truck extends Vehicle {

    /**
     * Constructs a new Truck instance with the specified vehicle details.
     * 
     * @param vehicleId The unique identifier for the truck.
     * @param model The model of the truck.
     * @param baseRentalRate The base rental rate for the truck.
     * @param isAvailable A flag indicating if the truck is available for rental.
     */
    public Truck(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        super(vehicleId, model, baseRentalRate, isAvailable);
    }

    /**
     * Calculates the rental cost for the truck based on the number of rental days.
     * This implementation multiplies the base rental rate by the number of days.
     * 
     * @param days The number of days the truck is rented for.
     * @return The total rental cost for the truck.
     */
    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days;
    }

    /**
     * Checks if the truck is available for rental.
     * 
     * @return {@code true} if the truck is available for rental, {@code false} otherwise.
     */
    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    /**
     * Returns a string representation of the truck, including its vehicle ID and model.
     * This is useful for logging and displaying information about the truck.
     * 
     * @return A string representing the truck object.
     */
    @Override
    public String toString() {
        return "Truck{" + "vehicleId='" + getVehicleId() + '\'' + ", model='" + getModel() + '\'' + '}';
    }
}
