package com.github.fireheart071;

public abstract class Vehicle {
    // Private encapsulated fields
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    // Constructors with validation
    public Vehicle (String vehicleId, String model, double baseRentalRate, boolean isAvailable){
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
    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public double getBaseRentalRate() {
        return baseRentalRate;
    }
    public void setBaseRentalRate(double baseRentalRate) {
        this.baseRentalRate = baseRentalRate;
    }


    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Abstract methods for rental calculation
    public double calculateRentalCost(int days){
        double total = baseRentalRate * days;
        return total;
    }
    
    public boolean isAvailableForRental(){
        return true;
    }
}
