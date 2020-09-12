package com.oneinlet.product;


import com.oneinlet.product.abs.RecreationalProduct;

public class BoxGameProduct extends RecreationalProduct {

    @Override
    public void play() {
        System.out.println("游戏涵盖魂斗罗，足球小子，俄罗斯方块");
    }

    @Override
    public void getName() {
        System.out.println("游戏盒子");
    }

    @Override
    public void getType() {
        System.out.println("我是娱乐性类产品");
    }
}
