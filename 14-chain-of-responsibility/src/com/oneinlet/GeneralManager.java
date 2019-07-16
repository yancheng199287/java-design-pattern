package com.oneinlet;

/**
 * 总经理审批只能请假十天以内
 */
public class GeneralManager extends IHandler {


    @Override
    public String handleaskforleave(String user, int day) {

        String result = "";
        if (day<=10) {
            //逻辑处理例如只同意张三请假
            if ("张三".equals(user)) {
                result = "同意：" + user + "请假,请假天数："+day+"天";
            } else {
                result = "不同意：" + user + "请假,请假天数："+day+"天";
            }
            System.out.println("总经理："+result);
        } else {
            System.out.println("请假时间过长别请了没人批！！！");
            if (getHandler() != null) {
                getHandler().handleaskforleave(user, day);
            }
        }
        return result;
    }
}
