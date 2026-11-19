package com.pratyush.practice.designpatterns.decorator;

public class Type2BasePizza implements Pizza{

    @Override
    public int getPrice() {
        return 60;
    }

    @Override
    public String getDescription() {
        return "Type 2 Base Pizza";
    }
}
