package com.pratyush.practice.designpatterns.crp;

public class TwoHDispatcher extends CashDispatcher{
    public TwoHDispatcher(){
        value = 200;
        next = new HDispatcher();
    }
}
