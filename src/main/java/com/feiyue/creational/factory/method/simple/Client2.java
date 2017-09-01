package com.feiyue.creational.factory.method.simple;

/**
 * 1.创建型设计模式之简单工厂模式
 * 角色：客户端
 * 作用：测试Factory2创建具体产品实例
 * @author: liangpengju
 * @date: 2017/8/30
 * @version: 1.0
 */
public class Client2 {

    public static void main(String[] args) {
        IFruit iFruit;
        try{
            //Apple
            iFruit = Factory2.createFruit(Apple.class);
            iFruit.printName();
            //Banana
            iFruit = Factory2.createFruit(Banana.class);
            iFruit.printName();
            //Orange
            iFruit = Factory2.createFruit(Orange.class);
            iFruit.printName();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
