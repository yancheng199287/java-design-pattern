package com.oneinlet;

/**
 * 访问者（Visitor）模式是一种对象行为型模式
 * 好处：抽离访问者、元素实现以及对象结构 修改只需要修改相应实现 一般对象结构不会变
 *
 */
public class App {
    public static void main(String[] args) {

        ObjectStructure os=new ConcreteObjectStructure();
        Element one = new ConcreteElementOne();
        Element two = new ConcreteElementTwo();
        os.add(one);
        os.add(two);
        Visitor visitor=new ConcreteVisitorOne();
        os.accept(visitor);
        System.out.println("------------------------");
        visitor=new ConcreteVisitorTwo();
        os.accept(visitor);

    }
}
