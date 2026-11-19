package com.pratyush.practice.designpatterns.absfactory;

import com.pratyush.practice.designpatterns.Vehicle;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new CarFactory();
        Vehicle vehicle = vehicleFactory.createVehicle();

        vehicle.start();
    }
}
