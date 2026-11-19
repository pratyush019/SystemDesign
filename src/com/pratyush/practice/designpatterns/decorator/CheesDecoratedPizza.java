package com.pratyush.practice.designpatterns.decorator;

public class CheesDecoratedPizza extends PizzaDecorator{
    public CheesDecoratedPizza(Pizza pizza){
        super(pizza);
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 5;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with extra cheese";
    }
}
