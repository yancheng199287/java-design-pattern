package com.oneinlet;

/**
 * description: 中介模式是A或者B或者C全部交由中介去处理自己想办的事情
 *
 *  使用方式:
 *  ABC委托给中介，中介再拿到ABC,ABC之间互相不感知，中介去做调用ABC
 *
 * @author: dawn.he
 * QQ:       905845006
 * @email: dawn.he@cloudwise.com
 * @email: 905845006@qq.com
 * @date: 2019/7/20    11:50 AM
 */
public class App {

    private static final int MONEY = 1000;
    public static void main(String[] args) {


        //中介负责调节  同事（他管理的类）
        Mediator mediator = new ConcreteMediator();

        //包租婆
        Colleague colleagueOne = new ConcreteColleagueOne(mediator);

        //我
        Colleague colleagueTwo = new ConcreteColleagueTwo(mediator);

        colleagueOne.howMachOneMonth(MONEY);
       // colleagueTwo.howMachOneMonth(0);

        //租3个月多少钱
       colleagueTwo.charge(3);

    }
}
