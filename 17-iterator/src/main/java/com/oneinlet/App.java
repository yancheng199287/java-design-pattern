package com.oneinlet;

/**
 * 迭代器模式 可以把容器想象成list 具体容器为arraylist 然后迭代器实现遍历list容器
 */
public class App {
    public static void main(String[] args) {
        String[] tvs = { "cctv-1", "cctv-2", "cctv-3", "cctv-4", "cctv-5", "cctv-6", "cctv-7" };
        Container tv = new ConcreteContainer();
        ((ConcreteContainer) tv).setTvs(tvs);
        Iterator iterator = tv.createrIterator();
        while (iterator.hasNext()) {
            System.out.println("TVChennel:" + iterator.next());
        }
    }
}
