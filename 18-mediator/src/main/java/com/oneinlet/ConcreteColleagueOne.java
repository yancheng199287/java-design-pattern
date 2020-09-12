package com.oneinlet;

/**
 * description: 具体同事类
 *
 * @author: dawn.he
 * QQ:       905845006
 * @email: dawn.he@cloudwise.com
 * @email: 905845006@qq.com
 * @date: 2019/7/20    11:50 AM
 */
public class ConcreteColleagueOne implements Colleague {

    private int money;

    private Mediator mediator;

    public ConcreteColleagueOne(Mediator mediator) {
        this.mediator = mediator;
        mediator.regist(this);
    }

    @Override
    public int charge(int rmb) {

        return 0;
    }

    @Override
    public int howMachOneMonth(int rmb) {
        System.out.println("包租婆一个月收" + rmb + " ：元");
        this.setMoney(rmb);
        return Integer.parseInt(mediator.howMachOneMonth(this));
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

