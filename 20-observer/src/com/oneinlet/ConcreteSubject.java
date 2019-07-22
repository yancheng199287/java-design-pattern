package com.oneinlet;

import java.util.ArrayList;
import java.util.List;

/**
 * description: 具体主题 ----被观察者实现
 *
 * @author: dawn.he
 * QQ:       905845006
 * @email: dawn.he@cloudwise.com
 * @email: 905845006@qq.com
 * @date: 2019/7/23    6:26 AM
 */
public class ConcreteSubject implements Subject{

    private String name;

    private String message;

    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {

        System.out.println(name+"注册上"+observer.getName()+"了");
        observerList.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {

        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {

        for (Observer o: observerList
             ) {
            o.update(name+"---"+message);
        }

    }

    public void setMessage(String message) {

        this.message = message;

        System.out.println("我是:"+name+"----"+message);

        notifyObserver();
    }

    public ConcreteSubject(String name) {
        this.name = name;
    }
}

