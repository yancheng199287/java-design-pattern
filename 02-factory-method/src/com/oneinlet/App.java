package com.oneinlet;

import com.oneinlet.factory.CameraFactory;
import com.oneinlet.factory.EFactory;
import com.oneinlet.factory.PhoneFactory;

/**
 * 工厂方法模式
 */
public class App {
    public static void main(String[] args) {

        EFactory factory = new PhoneFactory();
        factory.makeProduct().introduce();

        EFactory factory1 = new CameraFactory();
        factory1.makeProduct().introduce();

    }
}
