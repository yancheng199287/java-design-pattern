package com.oneinlet;

/**
 * 调用具体建造者来创建复杂对象的各个部分，在指导者中不涉及具体产品的信息，
 * 只负责保证对象各部分完整创建或按某种顺序创建
 */
public class CarDirector {

    // 按照某种顺序或业务逻辑创建
    public Car CarDirector(CarBuilder carBuilder) {
        carBuilder.intitle();
        carBuilder.paintColor();
        carBuilder.addEngine();
        carBuilder.setPrice();
        return carBuilder.buildCar();
    }
}
