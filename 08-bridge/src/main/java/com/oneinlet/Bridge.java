package com.oneinlet;

public abstract class Bridge {
    protected  Driver driver;


    public abstract void connect(String host, int port, String user, String password);

    // 得到真正的实现驱动对象
    public void setDriver(Driver driverTemp) {
        this.driver = driverTemp;
    }

}

