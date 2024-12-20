package com.github.fireheart071;

public class Customer {

    private String name;
    private int age;
    private boolean hasDrivingLiscense;
    private String phoneNumber;
    private int numberOfRentals;

    public Customer(String name){
        this.name = name;
        numberOfRentals ++;
        this.hasDrivingLiscense = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 18){
            throw new IllegalArgumentException("customer is not eligible because of age");
        }
        this.age = age;
    }

    public boolean isHasDrivingLiscense() {
        if(hasDrivingLiscense == false){
            throw new IllegalArgumentException("customer does not have driving license");
        }
        return hasDrivingLiscense;
    }

    public void setHasDrivingLiscense(boolean hasDrivingLiscense) {
        this.hasDrivingLiscense = hasDrivingLiscense;
    }

    public String getPhoneNumber() {
        if(phoneNumber == null || phoneNumber.trim().isEmpty()){
            throw new IllegalArgumentException("phoneNumber cannot be empty");
        }
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getNumberOfRentals() {
        return numberOfRentals;
    }

    public void setNumberOfRentals(int numberOfRentals) {
        this.numberOfRentals = numberOfRentals;
    }
    
}
