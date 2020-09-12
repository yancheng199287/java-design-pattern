package com.oneinlet.factory;

import com.oneinlet.product.ApplePhone;
import com.oneinlet.product.Product;

public class PhoneFactory implements EFactory {

    @Override
    public Product makeProduct() {
        System.out.println("我是手机工厂，正在加工生产手机...");

        return new ApplePhone();
    }
}
