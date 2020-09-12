package com.oneinlet;

/**
 * description: 环境角色
 *
 * @author: dawn.he
 * QQ:       905845006
 * @email: dawn.he@cloudwise.com
 * @email: 905845006@qq.com
 * @date: 2019/7/23    3:14 PM
 */
public class Context {

    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(){
         strategy.operation();
    }
}

