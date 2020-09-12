package com.oneinlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * description: 对象结构具体实现
 *
 * @author: dawn.he
 * QQ:       905845006
 * @email: dawn.he@cloudwise.com
 * @email: 905845006@qq.com
 * @date: 2019/7/23    7:43 AM
 */
public class ConcreteObjectStructure implements ObjectStructure {

    private List<Element> list=new ArrayList<Element>();


    @Override
    public void accept(Visitor visitor) {
        Iterator<Element> i=list.iterator();
        while(i.hasNext())
        {
           i.next().accept(visitor);
        }
    }

    @Override
    public void add(Element element) {
        list.add(element);
    }

    @Override
    public void remove(Element element) {
        list.remove(element);
    }
}

