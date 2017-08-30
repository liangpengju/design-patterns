package com.feiyue.creational.factory.method.simple;

/**
 * 1.创建型设计模式之简单工厂模式
 *  角色：简单工厂类
 * @author: liangpengju
 * @date: 2017/8/30
 * @version: 1.0
 */
public class Factory extends Client {

    public static IFruit getFruit(FType fType) throws Exception {
        switch (fType){
            case APPLE:
                return new Apple();
            case BANANA:
                return new Banana();
            case ORANGE:
                return new Orange();
            default:
                throw new Exception("不存在该实例");
        }
    }
}




























