package com.oneinlet;

/*
 * ConcreteComponent（具体被装饰对象）
 * 定义一个对象，可以给这个对象添加一些职责。
 */
public class GirlConcreteComponent implements AppearanceComponent {

    @Override
    public void introduce() {
        System.out.println("我是一个活泼可爱懵懂无知的萌妹子");
    }

    @Override
    public void hairStyle() {
        System.out.println("一头乌黑色的长发");
    }

    @Override
    public void dress() {
        System.out.println("一件粉色系少女款连衣裙");
    }

    @Override
    public void shoe() {
        System.out.println("一双水晶高跟鞋");
    }
}
