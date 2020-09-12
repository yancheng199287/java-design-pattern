package com.oneinlet.entity;

public class Iphone implements Phone {
    @Override
    public void getBrand() {
        System.out.println("苹果手机，来自美国Apple公司，创始人是乔布斯");
    }

    @Override
    public void getOS() {
        System.out.println("iOS是由苹果公司开发的移动操作系统，全称 iPhone OS");
    }
}
