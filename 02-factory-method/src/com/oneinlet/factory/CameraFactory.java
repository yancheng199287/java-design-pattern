package com.oneinlet.factory;

import com.oneinlet.product.CanonCamera;
import com.oneinlet.product.Product;

public class CameraFactory implements EFactory {
    @Override
    public Product makeProduct() {
        System.out.println("我是照相机工厂，正在加工生产相机...");

        return new CanonCamera();
    }
}
