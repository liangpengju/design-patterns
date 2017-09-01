package com.feiyue.creational.factory.method;

/**
 * 2.创建型设计模式之工厂方法模式 Factory Method Pattern
 * 角色：抽象工厂类
 * 作用：用于生产Apple
 * @author: liangpengju
 * @date: 2017/9/1
 * @version: 1.0
 */
public class AppleFactory implements IFactory {
    @Override
    public IFruit createFruit() {
        return new Apple();
    }
}
