package com.oneinlet;

/**
 * description:备忘录模式 分为三个角色，发起人，备忘录，管理者
 * 可以跟版本控制工具svn和git相结合理解，发起人就是你所在的分支节点，管理者就是历史版本记录，备忘录就是git仓库中的数据存储
 * 备忘录 是存取数据的地方，发起人是创建备忘录，恢复备忘录数据到某个节点，并且持有当前节点的所有数据
 * 管理者 创建新节点，将发起人恢复到某个节点，删除节点 相当于历史记录
 *
 * @author: dawn.he
 * QQ:       905845006
 * @email: dawn.he@cloudwise.com
 * @email: 905845006@qq.com
 * @date: 2019/7/20    1:28 PM
 */
public class App {
    public static void main(String[] args) {

        Originator o = new Originator();
        Caretaker c = new Caretaker(o);
        //增加数据 改变状态
        o.setState("state 0","小花");
        //创建新节点
        c.createMemento();
        //增加数据 改变状态
        o.setState("state 1",null);
        //创建新节点
        c.createMemento();
        //增加数据 改变状态
        o.setState("state 2","小白");
        //创建新节点
        c.createMemento();
        //增加数据 改变状态
        o.setState("state 3",null);
        //创建新节点
        c.createMemento();
        //打印出所有节点 和保存对象
        o.printStates();
        o.printDatas();
        System.out.println("-----------------恢复节点-----------------");
        //恢复到第三个节点
        c.restoreMemento(2);
        //打印出所有节点
        o.printStates();
        o.printDatas();
        //管理者在历史记录中删除第一个节点
        c.removeMemento(0);
        o.printStates();
        o.printDatas();
    }
}
