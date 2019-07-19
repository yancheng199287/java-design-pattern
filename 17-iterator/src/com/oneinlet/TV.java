package com.oneinlet;

/**
 * description: 具体容器
 *
 * @author: dawn.he
 * QQ:       905845006
 * @email: dawn.he@cloudwise.com
 * @email: 905845006@qq.com
 * @date: 2019/7/19    8:54 AM
 */
public class TV implements IContainer {
    private String[] tvs ;

    public TV() {
        System.out.println("open a tv");
    }

    @Override
    public Iterator createrIterator() {
        return new TVChannelIterator(getTvs());
    }

    public String[] getTvs() {
        return tvs;
    }

    public void setTvs(String[] tvs) {
        this.tvs = tvs;
    }
}

