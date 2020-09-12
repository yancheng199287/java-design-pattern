package com.oneinlet.product;

public class ApplePhone implements Product {
    @Override
    public void introduce() {
        System.out.println("我是苹果手机，被手机工厂加工生成出来的");
    }
}
