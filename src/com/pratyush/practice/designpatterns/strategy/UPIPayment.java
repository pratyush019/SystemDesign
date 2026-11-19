package com.pratyush.practice.designpatterns.strategy;

public class UPIPayment implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Paying via UPI");
    }
}
