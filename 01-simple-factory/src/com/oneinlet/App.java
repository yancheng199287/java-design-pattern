package com.oneinlet;

import com.oneinlet.entity.Phone;
import com.oneinlet.factory.Factory;

/*
 *  简单工厂模式， 通过传递所需的参数，使用静态方法加工生成所要的对象
 **/
public class App {

    public static void main(String[] args) {
        String[] names = {"苹果", "三星", "小米"};
        for (String name : names) {
            Phone phone = Factory.getPhone(name);
            phone.getBrand();
            phone.getOS();
            System.out.println("-------------------");
        }
    }
}
