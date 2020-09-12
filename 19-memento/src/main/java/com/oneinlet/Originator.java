package com.oneinlet;

import java.util.ArrayList;
import java.util.List;

/**
 * description:发起人
 *
 * @author: dawn.he
 * QQ:       905845006
 * @email: dawn.he@cloudwise.com
 * @email: 905845006@qq.com
 * @date: 2019/7/20    1:27 PM
 */
public class Originator {

    private List<String> states;
    //节点指数
    private int index;

    private List<String> datas;


    public Originator() {
        states =new ArrayList<>();
        datas = new ArrayList<>();
        index = 0;
    }

    public Originator(List<String> states,List<String> datas, int index) {
        this.states = states;
        this.index = index;
        this.datas = datas;
    }

    public List<String> getStates() {
        return states;
    }

    public void setState(String state,String data) {
        states.add(state);
        datas.add(data);
        index++;
    }
    /**
     * 辅助方法，打印所有状态节点
     */
    public void printStates(){
        System.out.println("节点共有："+states.size()+"个");
        for (String state : states) {
            System.out.println(state);
        }
    }
    /**
     * 辅助方法，打印所有存储数据
     */
    public void printDatas(){
        for (String data : datas) {
            System.out.println(data);
        }
    }
    /**
     * 创建备忘录
     */
    public Memento createMemento(){
        return new Memento(states,datas,index);
    }
    /**
     * 恢复备忘录数据 截取到需要恢复的那个节点
     */
    public void restoreMemento(int index){
       states = states.subList(0, index+1);
       datas =  datas.subList(0, index+1);
        this.index = index ;
        System.out.println("恢复节点共有："+(index+1)+"个");
    }

    /**
     * 将某个节点删除 从0开始
     */
    public void removeMemento(int index){
        states.remove(index);
        datas.remove(index);
        this.index--;
    }
}

