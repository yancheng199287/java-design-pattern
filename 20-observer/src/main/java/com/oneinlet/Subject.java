package com.oneinlet;

/**
 * description: 主题 ----被观察者 发布
 *
 * @author: dawn.he
 * QQ:       905845006
 * @email: dawn.he@cloudwise.com
 * @email: 905845006@qq.com
 * @date: 2019/7/23    6:23 AM
 */
public interface Subject {

    //注册观察者
    void registerObserver(Observer observer);

    //删除观察者
    void removeObserver(Observer observer);

    //通知观察者
    void notifyObserver();
}
