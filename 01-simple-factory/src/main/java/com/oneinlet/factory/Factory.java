package com.oneinlet.factory;


import com.oneinlet.entity.Iphone;
import com.oneinlet.entity.MiPhone;
import com.oneinlet.entity.Phone;
import com.oneinlet.entity.SamsungPhone;

public class Factory {
    public static Phone getPhone(String name) {
        if ("苹果".equals(name)) {
            return new Iphone();
        } else if ("三星".equals(name)) {
            return new SamsungPhone();
        } else if ("小米".equals(name)) {
            return new MiPhone();
        } else {
            throw new RuntimeException("无法找到该手机类型");
        }
    }
}
