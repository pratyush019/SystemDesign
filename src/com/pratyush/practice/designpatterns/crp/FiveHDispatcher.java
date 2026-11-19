package com.pratyush.practice.designpatterns.crp;

public class FiveHDispatcher extends CashDispatcher{

    public FiveHDispatcher(){
        value = 500;
        next = new TwoHDispatcher();
    }
}
