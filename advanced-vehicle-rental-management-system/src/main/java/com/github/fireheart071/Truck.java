package com.github.fireheart071;

public class Truck extends Vehicle {
    public Truck(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        super(vehicleId, model, baseRentalRate, isAvailable);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public String toString() {
        return "Truck{" + "vehicleId='" + getVehicleId() + '\'' + ", model='" + getModel() + '\'' + '}';
    }
}