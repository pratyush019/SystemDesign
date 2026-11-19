package com.pratyush.practice.designpatterns.singleton;

import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    public static void main(String[] args) {
        System.out.println(Singleton.getObject());
    }
}
