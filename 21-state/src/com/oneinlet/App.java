package com.oneinlet;

/**
 * 引用 ：http://c.biancheng.net/view/1388.html 可以参考共享状态模式 和模仿线程调用的设计方法
 * 状态模式： 环境类中调用状态接口，保存状态接口对象 ，调动状态实现类方法
 * 状态实现类写逻辑处理返回给环境类，继续调用下个状态实现类或者返回
 * @author: dawn.he
 * QQ:       905845006
 * @email: dawn.he@cloudwise.com
 * @email: 905845006@qq.com
 * @date: 2019/7/20    8:26 PM
 */
public class App {
    public static void main(String[] args) {
        ScoreContext account = new ScoreContext();
        System.out.println("学生成绩状态测试：");
        account.add(30);
        account.add(40);
        account.add(25);
        account.add(-15);
        account.add(-25);

    }
}
