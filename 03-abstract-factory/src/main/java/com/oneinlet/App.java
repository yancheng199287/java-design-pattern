package com.oneinlet;

import com.oneinlet.factory.Factory;
import com.oneinlet.factory.LearningProductFactory;
import com.oneinlet.factory.RecreationalProductFactory;

/**
 * 抽象工厂模式
 * <p>
 * 顶级工厂 Factory
 * 分类工厂 LearningProductFactory  RecreationalProductFactory
 * <p>
 * 顶级产品 Product
 * 分类产品 LearningProduct  RecreationalProduct
 * 具体产品  LearnMachineProduct BoxGameProduct
 * 具体产品是由分类工厂完成创建出来
 */
public class App {

    public static void main(String[] args) {
        Factory learningFactory = new LearningProductFactory();
        learningFactory.makeProduct().getType();
        learningFactory.makeProduct().getName();

        System.out.println("---------------------------");

        Factory recreationalFactory = new RecreationalProductFactory();
        recreationalFactory.makeProduct().getType();
        recreationalFactory.makeProduct().getName();
    }
}
