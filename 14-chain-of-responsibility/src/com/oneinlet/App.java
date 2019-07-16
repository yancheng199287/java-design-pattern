package com.oneinlet;

/**
 * 责任链模式（Chain of Responsibility Pattern）为请求创建了一个接收者对象的链。这种模式给予请求的类型，对请求的发送者和接收者进行解耦。这种类型的设计模式属于行为型模式。
 * <p>
 * 在这种模式中，通常每个接收者都包含对另一个接收者的引用。如果一个对象不能处理该请求，那么它会把相同的请求传给下一个接收者，依此类推。
 */
public class App {
    public static void main(String[] args) {

        //组装责任链
        IHandler generalhandler = new GeneralManager();
        IHandler depthandler = new DeptManager();
        IHandler projecthandler = new ProjectManager();

        projecthandler.setHandler(depthandler);
        depthandler.setHandler(generalhandler);
        //测试
        test1(projecthandler);
        test2(projecthandler);
        test3(projecthandler);
        test4(projecthandler);
    }

    private static void test1(IHandler projecthandler) {
        projecthandler.handleaskforleave("张三", 1);
        projecthandler.handleaskforleave("李四", 1);
        System.out.println("-------------------------------");

    }

    private static void test2(IHandler projecthandler) {
        projecthandler.handleaskforleave("张三", 4);
        projecthandler.handleaskforleave("李四", 4);
        System.out.println("-------------------------------");
    }

    private static void test3(IHandler projecthandler) {
        projecthandler.handleaskforleave("张三", 7);
        projecthandler.handleaskforleave("李四", 7);
        System.out.println("-------------------------------");

    }

    private static void test4(IHandler projecthandler) {
        projecthandler.handleaskforleave("张三", 11);
        projecthandler.handleaskforleave("李四", 11);
    }
}
