package com.oneinlet;

/**
 * 组合模式 ： 允许你将对象组合成树形结构来表现 "整体/部分" 层次结构。组合能够让我们用一致的方式处理个别对象以及对象集合。
 * 组合模式的包含角色：
 * ● Component 抽象构件角色
 * 定义参加组合对象的共有方法和属性，可以定义一些默认的行为或属性。
 * ● Leaf 叶子构件
 * 叶子对象，其下再也没有其他的分支，也就是遍历的最小单位。
 * ● Composite 树枝构件
 * 树枝对象，它的作用是组合树枝节点和叶子节点形成一个树形结构。
 * <p>
 * 使用场景：
 * ● 维护和展示部分-整体关系的场景，如树形菜单、文件和文件夹管理。
 * ● 从一个整体中能够独立出部分模块或功能的场景。
 * <p>
 * 注意事项：
 * <p>
 * 只要是树形结构，就要考虑使用组合模式，这个一定要记住，只要是要体现局部和整体的关系的时候，而且这种关系还可能比较深，考虑一下组合模式吧。
 */
public class App {
    public static void main(String[] args) {
        //创建一个根节点
        Composite root = new Composite();
        root.doSomething();
        //创建一个树枝构件
        Composite branch = new Composite();
        //创建一个叶子节点
        Leaf leaf = new Leaf();
        //建立整体
        root.add(branch);
        branch.add(leaf);

        display(root);
    }

    //通过递归遍历树
    public static void display(Composite root) {
        for (Component c : root.getChildren()) {
            if (c instanceof Leaf) { //叶子节点
                c.doSomething();
            } else { //树枝节点
                display((Composite) c);
            }
        }
    }
}
