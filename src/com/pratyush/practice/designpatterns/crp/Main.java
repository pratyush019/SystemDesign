package com.pratyush.practice.designpatterns.crp;

public class Main {
    public static void main(String[] args) {
        CashDispatcher cashDispatcher = new FiveHDispatcher();
        System.out.println(cashDispatcher.count(2890));
    }
}
