package com.oneinlet;

/**
 * description: 具体策略
 *
 * @author: dawn.he
 * QQ:       905845006
 * @email: dawn.he@cloudwise.com
 * @email: 905845006@qq.com
 * @date: 2019/7/23    3:13 PM
 */
public class ConcreteStrategyTwo implements Strategy{


    @Override
    public void operation() {
        System.out.println("调虎离山计策略实现");
    }
}

