package com.oneinlet;

/**
 * description: 具体元素
 *
 * @author: dawn.he
 * QQ:       905845006
 * @email: dawn.he@cloudwise.com
 * @email: 905845006@qq.com
 * @date: 2019/7/23    7:40 AM
 */
public class ConcreteElementOne implements Element {
    @Override
    public void accept(Visitor visitor) {

        visitor.visit(this);

    }

    public Object operation(Object o)
    {
        return "具体元素one的操作。";
    }
}

