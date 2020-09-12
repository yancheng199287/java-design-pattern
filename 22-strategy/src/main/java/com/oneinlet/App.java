package com.oneinlet;

/**
 * 策略模式 属于行为模式
 * —抽象策略角色： 策略类，通常由一个接口或者抽象类实现。
 * —具体策略角色：包装了相关的算法和行为。
 * —环境角色：持有一个策略类的引用，最终给客户端调用。
 * 优点：便于扩展
 * 缺点：增加一个策略就增加一个实现类
 */
public class App {
    public static void main(String[] args) {

        //创建策略
        Strategy strategy = new ConcreteStrategyOne();
        Strategy strategy1 = new ConcreteStrategyTwo();

        //调用A策略
        Context context = new Context(strategy);
        context.executeStrategy();

        //调用B策略
        Context context1 = new Context(strategy1);
        context1.executeStrategy();

    }
}
