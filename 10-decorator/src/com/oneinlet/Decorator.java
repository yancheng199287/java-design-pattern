package com.oneinlet;

/*
 *  Decorator（装饰者抽象类
 * 维持一个指向Component实例的引用，并定义一个与Component接口一致的接口
 */
public abstract class Decorator implements AppearanceComponent {

    protected AppearanceComponent appearanceComponent;

    public Decorator(AppearanceComponent appearanceComponent) {
        this.appearanceComponent = appearanceComponent;
    }

    @Override
    public void introduce() {
        System.out.println("今天我的穿着打扮是：");
        hairStyle();
        dress();
        shoe();
    }

    @Override
    public void hairStyle() {
        this.appearanceComponent.hairStyle();
    }

    @Override
    public void dress() {
        this.appearanceComponent.dress();
    }

    @Override
    public void shoe() {
        this.appearanceComponent.shoe();

    }
}
