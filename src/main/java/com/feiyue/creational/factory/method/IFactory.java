package com.feiyue.creational.factory.method;


/**
 * 2.创建型设计模式之工厂方法模式
 * 角色：抽象工厂接口
 * @author: liangpengju
 * @date: 2017/9/1
 * @version: 1.0
 */
public interface IFactory {

    //创建水果实例对象
    IFruit createFruit();


}
