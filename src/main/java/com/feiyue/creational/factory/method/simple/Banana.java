package com.feiyue.creational.factory.method.simple;

/**
 * 1.创建型设计模式之简单工厂模式
 *  角色：具体产品类，接口IFruit具体实现类
 * @author: liangpengju
 * @date: 2017/8/30
 * @version: 1.0
 */
public class Banana implements IFruit{
    @Override
    public void printName() {
        System.out.println("This is Banana...");
    }
}
