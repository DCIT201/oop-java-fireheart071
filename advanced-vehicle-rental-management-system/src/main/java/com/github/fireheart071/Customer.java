package com.github.fireheart071;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a customer in the vehicle rental system.
 * This class manages customer information such as name, age, driving license status, phone number,
 * and rental history. It also provides methods to validate and update customer information.
 */
public class Customer {

    private String name;
    private int age;
    private boolean hasDrivingLicense;
    private String phoneNumber;
    private List<RentalTransaction> rentalHistory;

    /**
     * Constructor to create a Customer object.
     * Initializes the customer's name, age, driving license status, phone number, and rental history.
     *
     * @param name The name of the customer.
     * @param age The age of the customer.
     * @param hasDrivingLicense Whether the customer has a valid driving license.
     * @param phoneNumber The phone number of the customer.
     */
    public Customer(String name, int age, boolean hasDrivingLicense, String phoneNumber) {
        setName(name);
        setAge(age);
        setHasDrivingLicense(hasDrivingLicense);
        setPhoneNumber(phoneNumber);
        this.rentalHistory = new ArrayList<>();
    }

    /**
     * Gets the customer's name.
     *
     * @return The name of the customer.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the customer's name.
     * Throws an exception if the name is null or empty.
     *
     * @param name The name to set for the customer.
     * @throws IllegalArgumentException if the name is null or empty.
     */
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    /**
     * Gets the customer's age.
     *
     * @return The age of the customer.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the customer's age.
     * Throws an exception if the age is less than 18.
     *
     * @param age The age to set for the customer.
     * @throws IllegalArgumentException if the age is less than 18.
     */
    public void setAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Customer must be at least 18 years old");
        }
        this.age = age;
    }

    /**
     * Checks if the customer has a valid driving license.
     *
     * @return true if the customer has a driving license, false otherwise.
     */
    public boolean hasDrivingLicense() {
        return hasDrivingLicense;
    }

    /**
     * Sets whether the customer has a valid driving license.
     *
     * @param hasDrivingLicense Whether the customer has a driving license.
     */
    public void setHasDrivingLicense(boolean hasDrivingLicense) {
        this.hasDrivingLicense = hasDrivingLicense;
    }

    /**
     * Gets the customer's phone number.
     *
     * @return The phone number of the customer.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the customer's phone number.
     * Throws an exception if the phone number is null or empty.
     *
     * @param phoneNumber The phone number to set for the customer.
     * @throws IllegalArgumentException if the phone number is null or empty.
     */
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Phone number cannot be empty");
        }
        this.phoneNumber = phoneNumber;
    }

    /**
     * Gets the customer's rental history.
     *
     * @return A list of rental transactions associated with this customer.
     */
    public List<RentalTransaction> getRentalHistory() {
        return rentalHistory;
    }

    /**
     * Adds a rental transaction to the customer's rental history.
     *
     * @param transaction The rental transaction to add to the history.
     */
    public void addRentalTransaction(RentalTransaction transaction) {
        rentalHistory.add(transaction);
    }
}
