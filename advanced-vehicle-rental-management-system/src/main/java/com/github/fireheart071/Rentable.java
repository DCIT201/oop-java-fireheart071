package com.github.fireheart071;

public interface Rentable {
    void rent(Customer customer, int days);

    void returnVehicle(String vehicleId);
}
