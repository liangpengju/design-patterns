package com.feiyue.factory.spring;

/**
 * 汽车
 */
public class Car implements Moveable{

    @Override
    public void run() {
        System.out.println("Car...");
    }
}
