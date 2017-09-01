package com.feiyue.creational.factory.method;

/**
 * 2.创建型设计模式之工厂方法模式 Factory Method Pattern
 * 角色：具体产品类
 * 作用：桔子类
 * @author: liangpengju
 * @date: 2017/9/1
 * @version: 1.0
 */
public class Orange implements IFruit {

    @Override
    public void getFruit() {
        System.out.println("Hi,This is Orange!");
    }
}
