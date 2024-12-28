package com.github.fireheart071;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {

    @Test
    public void testCustomerCreation() {
        Customer customer = new Customer("John Doe", 25, true, "123-456-7890");
        assertEquals("John Doe", customer.getName());
        assertEquals(25, customer.getAge());
        assertTrue(customer.hasDrivingLicense());
        assertEquals("123-456-7890", customer.getPhoneNumber());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidAge() {
        new Customer("John Doe", 17, true, "123-456-7890");
    }

    @Test
    public void testAddRentalTransaction() {
        Customer customer = new Customer("John Doe", 25, true, "0557687890");
        RentalTransaction transaction = new RentalTransaction(new Car("C001", "Toyota Camry", 35, true), customer, 3);
        customer.addRentalTransaction(transaction);
        assertEquals(1, customer.getRentalHistory().size());
    }
}
