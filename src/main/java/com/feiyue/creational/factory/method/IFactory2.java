package com.feiyue.creational.factory.method;

/**
 * 2.创建型设计模式之工厂方法模式
 * 角色：抽象工厂
 * 作用：第二种方式，定义具体工厂必须实现的方法
 * @author: liangpengju
 * @date: 2017/9/1
 * @version: 1.0
 */
public abstract class IFactory2 {
    /**
     * 运用Java的反射和泛型
     * @param clazz
     * @param <T>
     * @return
     */
    public abstract <T extends IFruit> T createFruit(Class<T> clazz);
}
