package com.oneinlet.factory;

import com.oneinlet.product.BoxGameProduct;
import com.oneinlet.product.abs.Product;

// 娱乐产品生产工厂
public class RecreationalProductFactory extends Factory {
    @Override
    public Product makeProduct() {
        return new BoxGameProduct();
    }
}
