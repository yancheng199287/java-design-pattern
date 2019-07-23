package com.oneinlet;

/**
 * description: 具体访问者
 *
 * @author: dawn.he
 * QQ:       905845006
 * @email: dawn.he@cloudwise.com
 * @email: 905845006@qq.com
 * @date: 2019/7/23    7:41 AM
 */
public class ConcreteVisitorOne implements Visitor {
    @Override
    public void visit(Element element) {

        if(element instanceof ConcreteElementOne)
            //element.operation(null);
            System.out.println("具体访问者one访问-->"+element.operation(null));
    }
}

