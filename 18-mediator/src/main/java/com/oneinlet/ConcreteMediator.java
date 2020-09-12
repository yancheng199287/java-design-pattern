package com.oneinlet;

/**
 * description: 具体中介实现
 *
 * @author: dawn.he
 * QQ:       905845006
 * @email: dawn.he@cloudwise.com
 * @email: 905845006@qq.com
 * @date: 2019/7/20    11:40 AM
 */
public class ConcreteMediator implements Mediator {

    private ConcreteColleagueOne colleagueOne;
    private ConcreteColleagueTwo colleagueTwo;

    @Override
    public int charge(int num) {

        if (colleagueOne!=null){
            System.out.println("中介"+num+"个月"+"赚钱租金"+colleagueOne.getMoney()*0.2*num+"元");
            return (int) (colleagueOne.getMoney()*1.2*3);
        }

        return -9999;
    }

    @Override
    public String howMachOneMonth(Colleague colleague) {

        if (colleague instanceof ConcreteColleagueOne) {
            System.out.println("中介收" + colleagueOne.getMoney() * 0.2 + "利息");
            this.colleagueTwo.howMachOneMonth((int) (colleagueOne.getMoney()+colleagueOne.getMoney()*0.2));

        } else if (colleague instanceof ConcreteColleagueTwo) {
            System.out.println("我给你看看多少钱");
            if(colleagueOne!=null){
                return String.valueOf(colleagueOne.getMoney());
            }else {
                return "包租婆么有在，我去问问";
            }
        }
        return "-999";
    }

    @Override
    public void regist(Colleague colleague) {
        if (colleague instanceof ConcreteColleagueOne) {
            this.colleagueOne = (ConcreteColleagueOne) colleague;
        } else if (colleague instanceof ConcreteColleagueTwo) {
            this.colleagueTwo = (ConcreteColleagueTwo) colleague;
        }
    }

}