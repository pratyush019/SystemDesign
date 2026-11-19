package com.pratyush.practice.designpatterns.builder;

public class Person {
    private String name;
    private int age;
    private String address;

    private Person(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public String toString(){
        return name + " "+ address+" "+age;
    }

    public static class Builder{

        private String name = "Default";
        private int age = 25;
        private String address = "Default";

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }
}
