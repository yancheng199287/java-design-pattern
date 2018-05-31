package com.oneinlet.product;

import com.oneinlet.product.abs.LearningProduct;

public class LearnMachineProduct extends LearningProduct {
    @Override
    public void learn() {
        System.out.println("学习机可以学习英语，数学，语文");
    }

    @Override
    public void getName() {
        System.out.println("天天学习机");
    }

    @Override
    public void getType() {
        System.out.println("我是学习类产品");
    }
}
