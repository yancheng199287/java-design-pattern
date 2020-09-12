package com.oneinlet;

/**
 * description: 中介
 *
 * @author: dawn.he
 * QQ:       905845006
 * @email: dawn.he@cloudwise.com
 * @email: 905845006@qq.com
 * @date: 2019/7/20    11:36 AM
 */
public interface Mediator {

    int charge(int rmb);

    String howMachOneMonth(Colleague colleague);

    void regist(Colleague colleague);
}
