package com.oneinlet;

/**
 * 装饰者模式: 装饰者模式可以动态地给一个对象添加一些额外的职责。就增加功能来说，Decorator模式相比生成子类更为灵活。
 */
public class App {
    public static void main(String[] args) {
        //appearanceComponent这个接口通过构造函数级联传递
        AppearanceComponent appearanceComponent = new GirlConcreteComponent();

        // 包装成美女
        appearanceComponent = new BelleConcreteDectrator(appearanceComponent);

        // 包装成女神
        appearanceComponent = new GoddessConcreteDectrator(appearanceComponent);

        // 自我介绍下

        appearanceComponent.introduce();

    }
}
