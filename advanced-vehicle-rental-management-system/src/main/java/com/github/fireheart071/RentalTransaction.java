package com.github.fireheart071;

import java.time.LocalDate;

/**
 * Represents a rental transaction between a customer and a vehicle.
 * This class contains information about the rental, such as the vehicle being rented, the customer renting it,
 * the number of rental days, and the date the rental was created.
 * It also calculates the total rental cost based on the vehicle's rental rate and the rental duration.
 */
public class RentalTransaction {
    private Vehicle vehicle;  // The vehicle involved in the rental transaction
    private Customer customer;  // The customer who rents the vehicle
    private int rentalDays;  // The number of days the vehicle is rented for
    private LocalDate rentalDate;  // The date the rental transaction was initiated

    /**
     * Constructs a new rental transaction with the specified vehicle, customer, and rental duration.
     * The rental date is automatically set to the current date.
     * 
     * @param vehicle The vehicle being rented in the transaction.
     * @param customer The customer who is renting the vehicle.
     * @param rentalDays The number of days the vehicle is being rented.
     */
    public RentalTransaction(Vehicle vehicle, Customer customer, int rentalDays) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.rentalDays = rentalDays;
        this.rentalDate = LocalDate.now();  // Sets the rental date to the current date
    }

    /**
     * Gets the vehicle associated with this rental transaction.
     * 
     * @return The vehicle rented in this transaction.
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * Gets the customer who rented the vehicle in this transaction.
     * 
     * @return The customer renting the vehicle.
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Gets the number of days the vehicle is rented for.
     * 
     * @return The rental duration in days.
     */
    public int getRentalDays() {
        return rentalDays;
    }

    /**
     * Gets the date the rental transaction was created.
     * 
     * @return The rental date.
     */
    public LocalDate getRentalDate() {
        return rentalDate;
    }

    /**
     * Calculates the total cost of the rental based on the vehicle's rental rate and the number of rental days.
     * 
     * @return The total rental cost.
     */
    public double calculateTotalCost() {
        return vehicle.calculateRentalCost(rentalDays);  // Calculates the rental cost using the vehicle's rental rate
    }
}
