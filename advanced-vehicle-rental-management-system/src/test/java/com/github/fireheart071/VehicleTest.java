package com.github.fireheart071;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VehicleTest {
    @Test
    public void testCarRentalCost() {
        Vehicle car = new Car("C001", "Toyota Camry", 35, true);
        assertEquals(105.0, car.calculateRentalCost(3), 0.001); // 35 * 3
    }

    @Test
    public void testMotorcycleRentalCost() {
        Vehicle motorcycle = new Motorcycle("M001", "Harley Davidson", 30, true);
        assertEquals(60.0, motorcycle.calculateRentalCost(2), 0.001); // 30 * 2
    }

    @Test
    public void testTruckRentalCost() {
        Vehicle truck = new Truck("T001", "Ford F-150", 40, true);
        assertEquals(200.0, truck.calculateRentalCost(5), 0.001); // 40 * 5
    }
}
