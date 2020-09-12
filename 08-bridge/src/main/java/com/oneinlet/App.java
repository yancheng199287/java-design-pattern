package com.oneinlet;

/**
 * 桥接模式：桥接模式将抽象部分与它的实现部分分离，使它们都可以独立地变化。
 * 优点
 * 1、分离抽象接口及其实现部分。提高了比继承更好的解决方案。
 * 2、桥接模式提高了系统的可扩充性，在两个变化维度中任意扩展一个维度，都不需要修改原有系统。
 * 3、实现细节对客户透明，可以对用户隐藏实现细节。
 */
public class App {
    public static void main(String[] args) {

        // 获取 桥接对象，由他处理数据库连接操作，对外屏蔽实现的连接细节
        // 把抽象的驱动接口，和具体的实现驱动接口，分离；
        // 原本用接口引用调用connect即可，改用桥接对象去调用连接操作
        // 具体对象不需要调用任何方法以及传递参数，只需要交给桥接对象去完成
        //桥接对象里的具体实现对象可以灵活切换
        Bridge dataBaseBridge = new DataBaseBridge();

        Driver mysqlDriver = new MysqlDriver();
        dataBaseBridge.setDriver(mysqlDriver);
        dataBaseBridge.connect("localhost", 3306, "root", "123");

        Driver sqlServerDriver = new SqlServerDriver();
        dataBaseBridge.setDriver(sqlServerDriver);
        dataBaseBridge.connect("localhost", 2339, "admin", "123");

    }


}
