package com.app.utils;

import com.app.exception.SpeedOutOfRangeException;
import com.app.models.Vehicle;

public class VehicleValidation {
    public final static int MIN_SPEED = 30;
    public final static int MAX_SPEED = 80;

    public static void speedValidate(Vehicle vehicle) throws SpeedOutOfRangeException {
        if(vehicle.getSpeed() < MIN_SPEED)
            throw new SpeedOutOfRangeException("Too Slow!!!");
        if(vehicle.getSpeed() > MAX_SPEED)
            throw new SpeedOutOfRangeException("Too Fast!!!");
    }

}
