package com.feiyue.factory.abstract1;

/**
 * DefaultFactory
 */
public class DefaultFactory extends AbstractFactory {
    @Override
    public Fruit createFruit() {
        return new Orange();
    }

    @Override
    public Vehicle createVehicle() {
        return new Jeep();
    }
}
