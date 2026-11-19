package com.pratyush.practice.designpatterns.strategy;

public class CardPayment implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Paying via card");
    }
}
