package com.feiyue.factory.spring;

/**
 * 公共汽车
 */
public class Bus implements Moveable{

    @Override
    public void run() {
        System.out.println("Bus...");
    }
}
