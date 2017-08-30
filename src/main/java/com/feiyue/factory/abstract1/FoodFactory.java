package com.feiyue.factory.abstract1;

/**
 * Created by pjliang on 2017/6/27.
 */
public class FoodFactory extends AbstractFactory {
    @Override
    public Fruit createFruit() {
        return new Apple();
    }

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
