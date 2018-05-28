package com.oneinlet.factory;

import com.oneinlet.product.Product;

// 电子工厂接口
public interface EFactory {
    //  生成产品
    Product makeProduct();
}
