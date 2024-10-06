package com.app.test;

import com.app.exception.SpeedOutOfRangeException;
import com.app.models.Vehicle;
import com.app.utils.VehicleValidation;

public class VehicleTest {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(100);
        try {
            VehicleValidation.speedValidate(vehicle);
        } catch (SpeedOutOfRangeException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("continue...");
    }
}
