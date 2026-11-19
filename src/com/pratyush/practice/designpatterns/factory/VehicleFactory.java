package com.pratyush.practice.designpatterns.factory;

import com.pratyush.practice.designpatterns.Bike;
import com.pratyush.practice.designpatterns.Car;
import com.pratyush.practice.designpatterns.Vehicle;

public class VehicleFactory {
    public static Vehicle getVehicle(String type){
        if(type.equalsIgnoreCase("bike")) return new Bike();
        if(type.equalsIgnoreCase("car")) return new Car();
        throw new RuntimeException("Vehicle of type- "+ type + " can't be created");
    }
}
