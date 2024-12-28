package com.github.fireheart071;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class RentalAgencyTest {
    private RentalAgency rentalAgency;

    @Before
    public void setUp() {
        rentalAgency = new RentalAgency();
        rentalAgency.addVehicle(new Car("C001", "Toyota Camry", 35, true));
        rentalAgency.addVehicle(new Motorcycle("M001", "Harley Davidson", 30, true));
        rentalAgency.addVehicle(new Truck("T001", "Ford F-150", 40, true));
    }

    @Test
    public void testRentVehicle() {
        Customer customer = new Customer("John Doe", 25, true, "123-456-7890");
        rentalAgency.rent(customer, 3); // Rent for 3 days
        assertFalse(rentalAgency.isAvailable("C001")); // Vehicle should be rented
    }

    @Test
    public void testReturnVehicle() {
        Customer customer = new Customer("John Doe", 25, true, "123-456-7890");
        rentalAgency.rent(customer, 3); // Rent for 3 days
        rentalAgency.returnVehicle("C001");
        assertTrue(rentalAgency.isAvailable("C001")); // Vehicle should be available again
    }

    @Test
    public void testRentUnavailableVehicle() {
        Customer customer = new Customer("John Doe", 25, true, "123-456-7890");
        rentalAgency.rent(customer, 3); // Rent for 3 days
        assertFalse(rentalAgency.isAvailable("C001")); // Vehicle should be rented
        // Attempt to rent again
        rentalAgency.rent(new Customer("Jane Doe", 30, true, "987-654-3210"), 2); // Rent for 2 days
        assertFalse(rentalAgency.isAvailable("C001")); // Should still be rented
    }

    @Test
    public void testReturnNonExistentVehicle() {
        rentalAgency.returnVehicle("C999"); // Attempt to return a vehicle that doesn't exist
        // Check that the vehicle list remains unchanged
        assertTrue(rentalAgency.isAvailable("C001")); // C001 should still be available
    }
}
