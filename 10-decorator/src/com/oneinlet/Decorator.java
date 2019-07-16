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
        /**
         * 如果子类没有重写父类的方法，那么在父类中调用方法，则是调用当前父类的方法，反之，调用子类的方法
         *
         * 注意：父类调用子类方法都是只调用一个子类中的方法，但是可以多次new对象调用多次
         * 比如说 intercept a = new interceptImpl() 那么调用的一定是 new interceptImpl()中方法
         * */
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
