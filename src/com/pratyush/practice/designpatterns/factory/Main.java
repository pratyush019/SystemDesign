package com.pratyush.practice.designpatterns.factory;

import com.pratyush.practice.designpatterns.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicle("drtf");
        vehicle.start();
        vehicle.stop();
    }
}
