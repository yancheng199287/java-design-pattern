package com.oneinlet;

/**
 * description: 访问者接口
 *
 * @author: dawn.he
 * QQ:       905845006
 * @email: dawn.he@cloudwise.com
 * @email: 905845006@qq.com
 * @date: 2019/7/23    7:31 AM
 */
public interface Visitor {

    //访问者调用元素
    void visit(Element element);

}
