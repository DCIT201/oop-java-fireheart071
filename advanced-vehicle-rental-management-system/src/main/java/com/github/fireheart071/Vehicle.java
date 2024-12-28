package com.github.fireheart071;

/**
 * Represents a generic vehicle in the vehicle rental system.
 * This class serves as an abstract base class for various types of vehicles such as cars, motorcycles, and trucks.
 * It defines common properties and behaviors that all vehicle types should inherit and customize.
 * 
 * <p>The vehicle class contains common details such as vehicle ID, model, rental rate, and availability.
 * Specific vehicle types will extend this class to provide concrete implementations of rental cost calculation and availability checks.</p>
 */
public abstract class Vehicle {
    // Private encapsulated fields
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    /**
     * Constructs a vehicle instance with the specified base rental rate.
     * This constructor is used when only the base rental rate is provided, and the vehicle ID, model, and availability are not set at this point.
     * 
     * @param baseRentalRate The base rental rate for the vehicle.
     */
    public Vehicle(double baseRentalRate){
        this.baseRentalRate = baseRentalRate;
    }

    /**
     * Constructs a vehicle instance with the specified details.
     * This constructor initializes the vehicle with a vehicle ID, model, base rental rate, and availability status.
     * It also validates the provided parameters to ensure they are correct.
     * 
     * @param vehicleId The unique identifier for the vehicle.
     * @param model The model of the vehicle.
     * @param baseRentalRate The base rental rate for the vehicle.
     * @param isAvailable The availability status of the vehicle (true if available, false otherwise).
     * @throws IllegalArgumentException if any of the parameters are invalid (e.g., empty strings or non-positive rental rate).
     */
    public Vehicle(String vehicleId, String model, double baseRentalRate, boolean isAvailable){
        if(vehicleId == null || vehicleId.trim().isEmpty()){
            throw new IllegalArgumentException("vehicleId cannot be empty");
        }
        if(model == null || model.trim().isEmpty()){
            throw new IllegalArgumentException("model cannot be empty");
        }
        if(baseRentalRate <= 0){
            throw new IllegalArgumentException("baseRentalRate cannot be empty");
        }
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = isAvailable;
    }

    // Getters and setters
    /**
     * Gets the unique identifier of the vehicle.
     * 
     * @return The vehicle ID.
     */
    public String getVehicleId() {
        return vehicleId;
    }

    /**
     * Sets the unique identifier for the vehicle.
     * 
     * @param vehicleId The new vehicle ID to set.
     */
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    /**
     * Gets the model of the vehicle.
     * 
     * @return The model of the vehicle.
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the model of the vehicle.
     * 
     * @param model The new model of the vehicle.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Gets the base rental rate for the vehicle.
     * 
     * @return The base rental rate of the vehicle.
     */
    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    /**
     * Sets the base rental rate for the vehicle.
     * 
     * @param baseRentalRate The new base rental rate to set.
     */
    public void setBaseRentalRate(double baseRentalRate) {
        this.baseRentalRate = baseRentalRate;
    }

    /**
     * Checks if the vehicle is available for rental.
     * 
     * @return {@code true} if the vehicle is available, {@code false} otherwise.
     */
    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * Sets the availability status of the vehicle.
     * 
     * @param isAvailable The new availability status of the vehicle.
     */
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Abstract methods for rental calculation
    /**
     * Abstract method for calculating the rental cost of the vehicle based on the number of days rented.
     * This method should be implemented by subclasses to provide specific rental cost logic.
     * 
     * @param days The number of days the vehicle is rented.
     * @return The total rental cost for the vehicle.
     */
    public abstract double calculateRentalCost(int days);

    /**
     * Abstract method to check if the vehicle is available for rental.
     * This method should be implemented by subclasses to provide specific availability checks.
     * 
     * @return {@code true} if the vehicle is available for rental, {@code false} otherwise.
     */
    public abstract boolean isAvailableForRental();
}
