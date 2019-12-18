package com.milan.design.Singleton;

public class Singleton1 {

    //饿汉式

    public static final Singleton1 singleton = new Singleton1();

    private Singleton1(){}

    public static Singleton1 getInstance(){
        return singleton;
    }

    public void sayHello(){
        System.out.println("Singleton1");
    }
}
