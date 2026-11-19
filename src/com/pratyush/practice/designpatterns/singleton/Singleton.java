package com.pratyush.practice.designpatterns.singleton;

public class Singleton {
    private static volatile Singleton INSTANCE;

    private Singleton(){

    }
    public static Singleton getObject() {

        if(INSTANCE == null) synchronized (Singleton.class){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
