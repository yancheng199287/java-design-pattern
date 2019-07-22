package com.oneinlet;

/**
 * 观察者模式 也可叫做发布订阅模式
 * 角色：
 * 1、抽象主题（Subject）：
 * 它把所有观察者对象的引用保存到一个聚集里，每个主题都可以有任何数量的观察者。抽象主题提供一个接口，可以增加和删除观察者对象。
 * 2、具体主题（Concrete Subject）：
 * 将有关状态存入具体观察者对象；在具体主题内部状态改变时，给所有登记过的观察者发出通知。
 * 3、抽象观察者（Observer）：
 * 为所有的具体观察者定义一个接口，在得到主题通知时更新自己。
 * 4、具体观察者（Concrete Observer）：
 * 实现抽象观察者角色所要求的更新接口，以便使本身的状态与主题状态协调。
 */
public class App {

    public static void main(String[] args) {

        //创建被观察者
        Subject zhangsan = new ConcreteSubject("张三");
        Subject lisi = new ConcreteSubject("李四");
        Subject wangwu = new ConcreteSubject("王五");
        Subject zhaoliu = new ConcreteSubject("赵六");
        Observer observer = new ConcreteObserver("张老师");


        Observer MrWang = new ConcreteObserver("王老师");

        //一个被观察者可以有多个观察者，也就是一个发布可以有多个订阅,一个观察者可以观察多个被观察者,也就是一个订阅可以订阅多个发布

        //所有被观察者把观察者注册到观察自己的列表
        zhangsan.registerObserver(observer);
        lisi.registerObserver(observer);
        lisi.registerObserver(MrWang);
        wangwu.registerObserver(observer);
        zhaoliu.registerObserver(observer);


        //被观察者做完自己事情通知观察者
        ((ConcreteSubject) lisi).setMessage("已背完卢沟桥课文了");
        ((ConcreteSubject) zhangsan).setMessage("已背完卢沟桥课文了");
        //赵六背不完，偷跑了
        zhaoliu.removeObserver(observer);
        ((ConcreteSubject) wangwu).setMessage("已背完卢沟桥课文了");

        System.out.println("偷跑的那个被观察者没被发现----------------");
    }
}
