package com.oneinlet;

/**
 * 被代理接口实现
 */
public class MysqlImpl implements Mysql {
    @Override
    public void read() {
        System.out.println("读取mysql内容！");
    }
}
