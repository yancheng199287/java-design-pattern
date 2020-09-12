package com.oneinlet;


import com.oneinlet.entity.ProductPrototype;
import com.oneinlet.entity.Prototype;
import com.oneinlet.entity.UserPrototype;

/**
 * 原型模式: 使用一个原型实例创建指定类型的对象，并且通过复制这个原型创建新的对象。
 * 原型模式优点如下：
 * 1. 当创建新的对象实例较为复杂时，可以简化对象创建过程，通过复制一个已有实例可以提高实例的创建效率。
 * 2. 扩展性较好，原型模式中提供了抽象原型类，在客户端可以针对抽象原型类进行编程。
 * 3. 原型模式提供了简化的创建结构，工厂方法模式常常需要有一个与产品类等级结构相同的工厂等级结构，而原型模式就不需要这样，原型模式中产品的复制是通过封装在原型类中的克隆方法实现的，无须专门的工厂类来创建产品。
 * 4.可以使用深克隆的方式保存对象的状态，使用原型模式将对象复制一份并将其状态保存起来，以便在需要的时候使用（如恢复到某一历史状态），可辅助实现撤销操作。
 * 原型模式缺点如下：
 * 1.需要为每一个类配备一个克隆方法，而且该克隆方法位于一个类的内部，当对已有的类进行改造时违背“开闭原则”。
 * 2. 在实现深克隆时需要编写较为复杂的代码，而且当对象之间存在多重的嵌套引用时，为了实现深克隆，每一层对象对应的类都必须支持深克隆比较麻烦。
 */

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new UserPrototype();
        System.out.println("prototype:" + prototype);
        UserPrototype userPrototype = (UserPrototype) prototype.clone();
        System.out.println("userPrototype:" + userPrototype);

        Prototype prototype1 = new ProductPrototype();
        System.out.println("prototype1:" + prototype1);
        ProductPrototype productPrototype = (ProductPrototype) prototype1.clone();
        System.out.println("productPrototype:" + productPrototype);
    }
}
