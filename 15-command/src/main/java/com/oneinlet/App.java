package com.oneinlet;

/**
 * 命令模式（Command Pattern）是一种数据驱动的设计模式，它属于行为型模式。请求以命令的形式包裹在对象中，并传给调用对象。
 * 调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令。
 * 通过调用者调用接受者执行命令，顺序：调用者→接受者→命令。
 */
public class App {
    public static void main(String[] args) {


        //创建请求

        RequestClass requestClass = new RequestClass();
        requestClass.setUsername("小明");
        requestClass.setDate("2019-09-22 10:34");

        //创建命令
        TV openTV = new OpenTV(requestClass);
        TV downTV = new DownTV(requestClass);
        //接受命令
        Broker broker = new Broker();

        broker.takeTV(openTV);

        broker.takeTV(downTV);


        //执行命令

        broker.placeTVs();
    }
}
