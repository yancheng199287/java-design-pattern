package com.oneinlet;

/**
 * description: 元素接口
 *
 * @author: dawn.he
 * QQ:       905845006
 * @email: dawn.he@cloudwise.com
 * @email: 905845006@qq.com
 * @date: 2019/7/23    7:36 AM
 */
public interface Element {

    //把访问者传进来调用自己
    void accept(Visitor visitor);

    //元素实现方法
    Object operation(Object t);
}
