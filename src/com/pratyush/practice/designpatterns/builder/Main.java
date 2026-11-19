package com.pratyush.practice.designpatterns.builder;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder().name("My Name").address("My address").build();
        System.out.println(person);
    }
}
