package com.oneinlet;

import java.util.ArrayList;
import java.util.List;

/**
 * description:管理者
 *
 * @author: dawn.he
 * QQ:       905845006
 * @email: dawn.he@cloudwise.com
 * @email: 905845006@qq.com
 * @date: 2019/7/20    1:28 PM
 */
public class Caretaker {

    private Originator o;
    private List<Memento> mementos = new ArrayList<>();
    private int current;
    /**
     * 构造函数
     */
    public Caretaker(Originator o) {
        this.o = o;
        current = 0;
    }
    /**创建一个新节点*/
    public int createMemento(){
        Memento memento = o.createMemento();
        mementos.add(memento);
        return current++;
    }
    /**
     * 将发起人恢复到某个节点 从0开始
     */
    public Memento restoreMemento(int index){
        Memento memento = mementos.get(index);
        o.restoreMemento(index);
        return memento;
    }
    /**
     * 将某个节点删除 从0开始
     */
    public Memento removeMemento(int index){
        Memento remove = mementos.remove(index);
        o.removeMemento(index);
        return remove;
    }
}

