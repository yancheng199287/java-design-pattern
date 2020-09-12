package com.oneinlet;

/**
 * description: 对象结构接口
 *
 * @author: dawn.he
 * QQ:       905845006
 * @email: dawn.he@cloudwise.com
 * @email: 905845006@qq.com
 * @date: 2019/7/23    7:38 AM
 */
public interface ObjectStructure {

    //依次遍历元素让访问者调用
     void accept(Visitor visitor);

     //添加元素
     void add(Element element);

     //删除元素
     void remove(Element element);
}
