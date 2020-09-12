package com.oneinlet;

import java.math.BigDecimal;

/**
 * 实现Builder接口，针对不同的商业逻辑，具体化复杂对象的各部分的创建。 在建造过程完成后，提供产品的实例
 */
public class CarConcreteBuilder implements CarBuilder {
    private Car car;

    public CarConcreteBuilder() {
        car = new Car();
    }

    @Override
    public void paintColor() {
        car.setColor("黑色");
    }

    @Override
    public void intitle() {
        car.setName("布加迪威龙");
    }

    @Override
    public void addEngine() {
        car.setEngine("987马力的4涡增压款W-16");
    }

    @Override
    public void setPrice() {
        car.setPrice(new BigDecimal("25000000"));
    }

    public Car buildCar() {
        return car;
    }
}
