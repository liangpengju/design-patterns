package com.feiyue.creational.factory.method;

/**
 * 2.创建型设计模式之工厂方法模式
 * 角色：具体工厂
 * 作用：第二种方式，实现抽象工厂
 * @author: liangpengju
 * @date: 2017/9/1
 * @version: 1.0
 */
public class ConcreteFactory extends IFactory2 {

    @Override
    public <T extends IFruit> T createFruit(Class<T> clazz) {
        T fruit = null;
        try {
            fruit = (T) Class.forName(clazz.getName()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return fruit;
    }
}



























