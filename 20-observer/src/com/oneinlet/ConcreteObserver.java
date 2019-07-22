package com.oneinlet;

/**
 * description: 具体观察者
 *
 * @author: dawn.he
 * QQ:       905845006
 * @email: dawn.he@cloudwise.com
 * @email: 905845006@qq.com
 * @date: 2019/7/23    6:27 AM
 */
public class ConcreteObserver implements Observer{


    private String name;

    private String message;

    @Override
    public void update(String message) {

        this.message = message;

        System.out.println("我是"+name+"------"+this.message);
    }

    public ConcreteObserver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

