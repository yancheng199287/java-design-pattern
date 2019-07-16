package com.oneinlet;

/**
 * 项目经理审批只能请假一天
 */
public class ProjectManager extends IHandler {


    @Override
    public String handleaskforleave(String user, int day) {

        String result = "";
        if (day == 1) {
            //逻辑处理例如只同意张三请假
            if ("张三".equals(user)) {
                result = "同意：" + user + "请假,请假天数："+day+"天";
            } else {
                result = "不同意：" + user + "请假,请假天数："+day+"天";
            }
            System.out.println("项目经理："+result);
        } else {
            if (getHandler() != null) {
                System.out.println("项目经理权限不足！到下一级");
                getHandler().handleaskforleave(user, day);

            }
        }
        return result;
    }
}
