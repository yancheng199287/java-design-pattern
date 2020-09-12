package com.oneinlet;

/**
 * description: 具体同事类
 *
 * @author: dawn.he
 * QQ:       905845006
 * @email: dawn.he@cloudwise.com
 * @email: 905845006@qq.com
 * @date: 2019/7/20    11:51 AM
 */
public class ConcreteColleagueTwo implements Colleague {

    private Mediator mediator;

    public ConcreteColleagueTwo(Mediator mediator) {
        this.mediator = mediator;
        mediator.regist(this);
    }

    @Override
    public int charge(int rmb) {
        int charge = mediator.charge(3);
        if (charge == -9999) {
            System.out.println("房东没在");
        } else {
            System.out.println("共交房租：" + charge + "元");
        }
        return charge;
    }

    @Override
    public int howMachOneMonth(int rmb) {
        if (rmb != 0) {
            System.out.println("每月交：" + rmb + " 元");
        } else if (rmb == 0) {
            mediator.howMachOneMonth(this);
        }

        return -999;
    }
}

