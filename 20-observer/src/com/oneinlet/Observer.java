package com.oneinlet;

/**
 * description: 观察者接口
 *
 * @author: dawn.he
 * QQ:       905845006
 * @email: dawn.he@cloudwise.com
 * @email: 905845006@qq.com
 * @date: 2019/7/23    6:20 AM
 */
public interface Observer {


    //观察者跟新自己状态
    void update(String message);


    //为了展示用多加了个方法(请忽略)
    String getName();
}
