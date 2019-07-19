package com.oneinlet;

/**
 * description: 具体迭代器 对电视容器遍历
 *
 * @author: dawn.he
 * QQ:       905845006
 * @email: dawn.he@cloudwise.com
 * @email: 905845006@qq.com
 * @date: 2019/7/19    8:55 AM
 */
public class TVChannelIterator implements Iterator {
    private String[] tvChannel ;
    private int current = 0;

    public TVChannelIterator(String[] tvChannel) {
        this.tvChannel = tvChannel;
    }

    @Override
    public String next() {
        if (hasNext()) {
            return tvChannel[current++];
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        if (current < tvChannel.length) {
            return true;
        }
        return false;
    }
}

