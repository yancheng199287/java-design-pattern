package com.oneinlet;

/**
 * 建造者模式
 * 一、什么是建造者模式
 * 建造者模式：是将一个复杂的对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 * 方便用户创建复杂的对象（不需要知道实现过程）
 * 代码复用性 & 封装性（将对象构建过程和细节进行封装 & 复用）
 */
public class App {
    public static void main(String[] args) {
        CarDirector carDirector = new CarDirector();
        Car car = carDirector.CarDirector(new CarConcreteBuilder());
        System.out.println(car.toString());
    }
}
