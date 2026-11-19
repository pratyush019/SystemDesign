package com.pratyush.practice.designpatterns.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy paymentStrategy = new CardPayment();
//        PaymentStrategy paymentStrategy = new CashPayment();
//        PaymentStrategy paymentStrategy = new UPIPayment();
        paymentStrategy.pay();
    }
}
