package com.github.fireheart071;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private int age;
    private boolean hasDrivingLicense;
    private String phoneNumber;
    private List<RentalTransaction> rentalHistory;

    public Customer(String name, int age, boolean hasDrivingLicense, String phoneNumber) {
        setName(name);
        setAge(age);
        setHasDrivingLicense(hasDrivingLicense);
        setPhoneNumber(phoneNumber);
        this.rentalHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Customer must be at least 18 years old");
        }
        this.age = age;
    }

    public boolean hasDrivingLicense() {
        return hasDrivingLicense;
    }

    public void setHasDrivingLicense(boolean hasDrivingLicense) {
        this.hasDrivingLicense = hasDrivingLicense;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Phone number cannot be empty");
        }
        this.phoneNumber = phoneNumber;
    }

    public List<RentalTransaction> getRentalHistory() {
        return rentalHistory;
    }

    public void addRentalTransaction(RentalTransaction transaction) {
        rentalHistory.add(transaction);
    }
}