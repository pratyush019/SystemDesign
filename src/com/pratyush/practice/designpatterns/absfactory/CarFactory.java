package com.pratyush.practice.designpatterns.absfactory;

import com.pratyush.practice.designpatterns.Car;
import com.pratyush.practice.designpatterns.Vehicle;

public class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
