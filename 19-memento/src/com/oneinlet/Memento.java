package com.oneinlet;

import java.util.List;

/**
 * description:备忘录
 *
 * @author: dawn.he
 * QQ:       905845006
 * @email: dawn.he@cloudwise.com
 * @email: 905845006@qq.com
 * @date: 2019/7/20    1:28 PM
 */
public class Memento {

    private List<String> states;

    private int index;

    private List<String> datas;


    public Memento(List<String> states, List<String> datas, int index) {
        this.states = states;
        this.datas = datas;
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public List<String> getDatas() {
        return datas;
    }

    public List<String> getStates() {
        return states;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "states=" + states +
                ", index=" + index +
                ", datas='" + datas + '\'' +
                '}';
    }
}

