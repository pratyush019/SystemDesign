package com.pratyush.practice.designpatterns.decorator;

public class ToppingDecoratedPizza extends PizzaDecorator{

    public ToppingDecoratedPizza(Pizza pizza){
        super(pizza);
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 10;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with extra toppings";
    }
}
