package com.oneinlet;

/**
 *   分离
 *
 * */
public class DataBaseBridge extends Bridge {

    @Override
    public void connect(String host, int port, String user, String password) {
        if (driver == null) {
            throw new RuntimeException("找不到相关的连接驱动...");
        }
        driver.connect(host, port, user, password);
    }
}
