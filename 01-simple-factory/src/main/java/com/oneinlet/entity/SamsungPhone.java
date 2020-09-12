package com.oneinlet.entity;

public class SamsungPhone implements Phone {
    @Override
    public void getBrand() {
        System.out.println("三星集团是韩国最大的跨国企业集团，同时也是上市企业全球500强，来自韩国，创始人是李秉喆");
    }

    @Override
    public void getOS() {
        System.out.println("三星手机，使用的Android系统，来自韩国");
    }
}
