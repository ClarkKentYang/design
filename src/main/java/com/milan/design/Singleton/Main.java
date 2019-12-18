package com.milan.design.Singleton;

public class Main {

    public static void main(String[] args) {
        Singleton1.getInstance().sayHello();
        Singleton1 instance1_1 = Singleton1.getInstance();
        Singleton1 instance1_2 = Singleton1.getInstance();
        System.out.println(instance1_1==instance1_2);

        Singleton2 instance2_1 = Singleton2.getInstance();
        Singleton2 instance2_2 = Singleton2.getInstance();
        System.out.println(instance2_1==instance2_2);

    }

}
