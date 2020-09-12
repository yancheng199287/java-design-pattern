package com.oneinlet.entity;

public class MiPhone implements Phone {
    @Override
    public void getBrand() {
        System.out.println("小米手机，来自中国小米科技公司，创始人是雷军");
    }

    @Override
    public void getOS() {
        System.out.println("小米手机使用的Android系统进行深度定制，也叫 MIUI OS");
    }
}
