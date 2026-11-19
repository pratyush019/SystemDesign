package com.pratyush.practice.designpatterns.strategy;

public class CashPayment implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Paying in Cash");
    }
}
