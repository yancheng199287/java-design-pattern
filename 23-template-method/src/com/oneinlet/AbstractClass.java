package com.oneinlet;

/**
 * description: 抽象模板类
 *
 * @author: dawn.he
 * QQ:       905845006
 * @email: dawn.he@cloudwise.com
 * @email: 905845006@qq.com
 * @date: 2019/7/20    8:05 PM
 */
abstract class AbstractClass {

    //模板方法
    public void TemplateMethod()
    {
        abstractMethod1();
        HookMethod1();
        if(HookMethod2())
        {
            SpecificMethod();
        }
        abstractMethod2();
    }
    //具体方法
    public void SpecificMethod()
    {
        System.out.println("抽象类具体方法...");
    }
    //钩子方法1
    public void HookMethod1(){}
    //钩子方法2
    public boolean HookMethod2()
    {
        return true;
    }
    //抽象方法1
    public abstract void abstractMethod1();
    //抽象方法2
    public abstract void abstractMethod2();

}

