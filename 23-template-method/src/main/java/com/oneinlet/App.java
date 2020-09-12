package com.oneinlet;

/**
 * 模板方法模式 抽象类写好模板，子类去实现，钩子方法可以重写抽象类中的方法
 */
public class App {
    public static void main(String[] args) {


        AbstractClass abstractClass = new ConcreteClass();
        abstractClass.TemplateMethod();
       // ((ConcreteClass) abstractClass).HookMethod2(true);

    }
}
