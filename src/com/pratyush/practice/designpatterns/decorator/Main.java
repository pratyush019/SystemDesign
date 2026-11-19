package com.pratyush.practice.designpatterns.decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Type2BasePizza();
        pizza = new CheesDecoratedPizza(pizza);
        pizza = new ToppingDecoratedPizza(pizza);

        System.out.println(pizza);
    }
}
