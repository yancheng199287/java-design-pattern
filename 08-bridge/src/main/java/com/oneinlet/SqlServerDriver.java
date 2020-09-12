package com.oneinlet;

/**
 * 具体实现
 * 针对不同的驱动接口，会有多种实现，在这里实现sql server数据库类型的驱动
 */
public class SqlServerDriver implements Driver {
    @Override
    public void connect(String host, int port, String user, String password) {
        String s = String.format("进行sql server数据库连接，主机名:%s, 端口:%s, 用户名:%s, 密码:%s", host, port, user, password);
        System.out.println(s);
    }
}
