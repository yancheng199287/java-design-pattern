package com.oneinlet;

// 适配器类
public class Adapter implements Target {

    /*
     * 持有需要被适配的接口对象
     */
    private Adaptee adaptee;

    /*
     * 构造方法，传入需要被适配的对象
     * @param adaptee 需要被适配的对象
     */
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * 目标接口要求调用Request()这个方法，但源类Adaptee没有方法Request()
     * 因此适配器补充上这个方法名
     * 但实际上Request()只是调用源类Adaptee的SpecificRequest()方法的内容
     * 所以适配器只是将SpecificRequest()方法作了一层封装，封装成Target可以调用的Request()而已
     */
    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
