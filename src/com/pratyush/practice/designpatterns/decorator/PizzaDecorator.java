package com.pratyush.practice.designpatterns.decorator;

public abstract class PizzaDecorator implements Pizza{
    protected Pizza pizza;

    protected PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    public String toString(){
        return getDescription() + " "+ getPrice();
    }
}
