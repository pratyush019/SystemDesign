package com.pratyush.practice.designpatterns.decorator;

public class Type1BasePizza implements Pizza{

    @Override
    public int getPrice() {
        return 50;
    }

    @Override
    public String getDescription() {
        return "Type 1 Base Pizza";
    }
}
