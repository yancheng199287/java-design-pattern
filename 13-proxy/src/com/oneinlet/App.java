package com.oneinlet;

/**
 * 在代理模式（Proxy Pattern）中，一个类代表另一个类的功能。这种类型的设计模式属于结构型模式。
 */
public class App {
    public static void main(String[] args) {

        Mysql mysql = new ProxyMysql();
        mysql.read();
    }
}
