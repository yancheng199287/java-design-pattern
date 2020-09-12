package com.oneinlet;

/**
 * 给出一个抽象接口，以规范产品对象的各个组成成分的建造。这个接口规定要实现复杂对象的哪些部分的创建，并不涉及具体的对象部件的创建
 * */
public interface CarBuilder {

    // 上色
    void paintColor();

    // 取名
    void intitle();

    // 添加引擎装置
    void addEngine();

    // 设置价格
    void setPrice();

    Car buildCar();

}
