package com.pratyush.practice.designpatterns.absfactory;

import com.pratyush.practice.designpatterns.Bike;
import com.pratyush.practice.designpatterns.Vehicle;

public class BikeFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}
