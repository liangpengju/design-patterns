package com.feiyue.factory.abstract1;

/**
 * 测试工厂
 */
public class Test {

    public static void main(String[] args) {
        //DefaultFactory f = new DefaultFactory();
        AbstractFactory f = new DefaultFactory();
        //水果
        Fruit fruit = f.createFruit();
        fruit.printName();
        //汽车
        Vehicle vehicle = f.createVehicle();
        vehicle.run();
    }

}
