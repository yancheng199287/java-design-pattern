package com.oneinlet;

/**
 * description: 抽象模板类具体子类
 *
 * @author: dawn.he
 * QQ:       905845006
 * @email: dawn.he@cloudwise.com
 * @email: 905845006@qq.com
 * @date: 2019/7/20    8:05 PM
 */
public class ConcreteClass extends AbstractClass{
    public void abstractMethod1()
    {
        System.out.println("抽象方法1的实现被调用...");
    }
    public void abstractMethod2()
    {
        System.out.println("抽象方法2的实现被调用...");
    }
    public void HookMethod1()
    {
        System.out.println("钩子方法1被重写...");
    }
    public boolean HookMethod2(boolean flag)
    {
        System.out.println("钩子方法2被重写...");

        return flag;
    }
}

