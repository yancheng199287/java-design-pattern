package com.oneinlet;


public class Singleton {
    private static Singleton lazyGuy = null;

    //类的构造函数定义为private的，保证其他类不能随便使用new关键字实例化此类
    private Singleton() {
    }

    /**
     * 1. 懒汉模式中单例是在需要的时候才去创建的，如果单例已经创建，再次调用获取接口将不会重新创建新的对象，而是直接返回之前创建的对象。
     * 如果某个单例使用的次数少，并且创建单例消耗的资源较多，那么就需要实现单例的按需创建，这个时候使用懒汉模式就是一个不错的选择。
     * 但是这里的懒汉模式并没有考虑线程安全问题，在多个线程可能会并发调用它的getInstance()方法，导致创建多个实例，
     * 因此需要加锁解决线程同步问题
     */
    public static synchronized Singleton getInstance() {
        if (lazyGuy == null) {
            lazyGuy = new Singleton();
        }
        return lazyGuy;
    }


    /**
     * 2. 饿汉模式在类加载的时候就对实例进行创建，实例在整个程序周期都存在。
     * 它的好处是只在类加载的时候创建一次实例，不会存在多个线程创建多个实例的情况，避免了多线程同步的问题。
     * 它的缺点也很明显，即使这个单例没有用到也会被创建，而且在类加载之后就被创建，内存就被浪费了
     **/
    private static Singleton instance = new Singleton();
    public static Singleton newInstance() {
        return instance;
    }


    /***
     * 3. 重校验锁
     * 双重校验锁即实现了延迟加载，又解决了线程并发问题，同时还解决了执行效率问题，是否真的就万无一失了呢
     * Java中的指令重排优化可能在多线程环境下，导致初始化LazyGuy和将对象地址赋给lazyGuy字段的顺序是不确定的
     * 那么双重校验锁会失效，如何解决，还好在JDK1.5及之后版本增加了volatile关键字。
     *
     * volatile的一个语义是禁止指令重排序优化，也就保证了instance变量被赋值的时候对象已经是初始化过的，从而避免了上面说到的问题
     * **/
    public static Singleton getInstance01() {
        if (lazyGuy == null) {
            synchronized (Singleton.class) {
                if (lazyGuy == null) {//2
                    lazyGuy = new Singleton();
                }
            }
        }
        return lazyGuy;
    }


    /**
     * 4. volatile的一个语义是禁止指令重排序优化，也就保证了instance变量被赋值的时候对象已经是初始化过的
     **/
    private volatile static Singleton instance01 = null;

    public static Singleton getInstance02() {
        if (instance01 == null) {
            synchronized (Singleton.class) {
                if (instance01 == null) {//2
                    instance01 = new Singleton();
                }
            }
        }
        return instance01;
    }


    /**
     * 5. 枚举类很好的解决了这两个问题，使用枚举除了线程安全和防止反射调用构造器之外，还提供了自动序列化机制，防止反序列化的时候创建新的对象。
     * 因此，《Effective Java》作者推荐使用的方法
     */
    public enum SingletonEnum {
        Singleton;
    }
}
