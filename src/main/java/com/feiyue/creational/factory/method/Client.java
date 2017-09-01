package com.feiyue.creational.factory.method;

/**
 * 2.创建型设计模式之工厂方法模式 Factory Method Pattern
 * 角色：客户端
 * 作用：用于测试工厂方法模式
 * @author: liangpengju
 * @date: 2017/9/1
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        //抽象工厂
        IFactory iFactory = new AppleFactory();
        //抽象产品
        IFruit iFruit = iFactory.createFruit();
        iFruit.getFruit();
    }
}
