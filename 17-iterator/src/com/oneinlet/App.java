package com.oneinlet;

/**
 * 迭代器模式
 */
public class App {
    public static void main(String[] args) {
        String[] tvs = { "cctv-1", "cctv-2", "cctv-3", "cctv-4", "cctv-5", "cctv-6", "cctv-7" };
        IContainer tv = new TV(); // 电视台
        ((TV) tv).setTvs(tvs);
        Iterator iterator = tv.createrIterator();
        while (iterator.hasNext()) {
            System.out.println("TVChennel:" + iterator.next());
        }
    }
}
