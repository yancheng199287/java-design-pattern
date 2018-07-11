package com.oneinlet;

/*
 * Component（被装饰对象的基类）
 * 定义一个对象接口，可以给这些对象动态地添加职责
 *
 */
public interface AppearanceComponent {

    // 自我介绍
    void introduce();

    // 什么发型
    void hairStyle();

    // 穿什么衣服
    void dress();

    // 穿什么鞋子
    void shoe();
}
