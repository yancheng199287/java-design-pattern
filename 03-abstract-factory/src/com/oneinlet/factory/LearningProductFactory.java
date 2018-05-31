package com.oneinlet.factory;

import com.oneinlet.product.LearnMachineProduct;
import com.oneinlet.product.abs.Product;

// 学习类产品工厂
public class LearningProductFactory extends Factory {

    @Override
    public Product makeProduct() {

        return new LearnMachineProduct();
    }
}
