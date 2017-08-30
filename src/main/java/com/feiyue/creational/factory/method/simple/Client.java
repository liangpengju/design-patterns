package com.feiyue.creational.factory.method.simple;

/**
 * 1.创建型设计模式之简单工厂模式
 *  角色：客户端
 * @author: liangpengju
 * @date: 2017/8/30
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        IFruit iFruit;
        try{
            //Apple
            iFruit = Factory.getFruit(FType.APPLE);
            iFruit.printName();
            //Banana
            iFruit = Factory.getFruit(FType.BANANA);
            iFruit.printName();
            //Orange
            iFruit = Factory.getFruit(FType.ORANGE);
            iFruit.printName();
            //PEACH 没有该实例
            iFruit = Factory.getFruit(FType.PEACH);
            iFruit.printName();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
