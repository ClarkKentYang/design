package com.milan.design.Singleton;

public class Singleton2 {

    //懒汉式

    public static Singleton2 singleton2;

    public static Singleton2 getInstance(){
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }

    public static void sayHello(){
        System.out.println("Singleton2");
    }

}
