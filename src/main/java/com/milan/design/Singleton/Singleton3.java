package com.milan.design.Singleton;

public class Singleton3 {

    //双重校验锁机制

    public static Singleton3 singleton3;

    public static Singleton3 getInstance(){
        if(singleton3==null){
            synchronized (Singleton3.class){
                if (singleton3 == null) {
                    singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;
    }

    public static void sayHello(){
        System.out.println("Singleton3");
    }

}
