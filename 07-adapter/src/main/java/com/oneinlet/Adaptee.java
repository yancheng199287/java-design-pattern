package com.oneinlet;

// 被适配的对象
public class Adaptee {

    /*
     * 原本存在的方法
     */
    public void specificRequest() {
        System.out.println("被适配对象的原本存在的方法");
    }
}
