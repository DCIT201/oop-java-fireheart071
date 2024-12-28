package com.github.fireheart071;

/**
 * Represents a contract for any vehicle that can be rented.
 * The Rentable interface defines the basic actions associated with renting and returning a vehicle.
 * Any class that implements this interface will need to provide specific implementations of the rental and return behavior.
 */
public interface Rentable {

    /**
     * Rents a vehicle to a customer for a specified number of days.
     * This method is used to initiate the rental process, associating a customer with a vehicle and specifying the duration of the rental.
     *
     * @param customer The customer who is renting the vehicle.
     * @param days The number of days the vehicle is being rented.
     */
    void rent(Customer customer, int days);

    /**
     * Returns a rented vehicle.
     * This method is used to process the return of a vehicle once the rental period has ended.
     *
     * @param vehicleId The ID of the vehicle being returned.
     */
    void returnVehicle(String vehicleId);
}
