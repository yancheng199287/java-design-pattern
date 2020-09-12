package com.oneinlet;


public abstract class IHandler {

    /**
     * 持有下一个处理的请求对象
     *
     * */
     protected IHandler handler = null;

    /**
     * 获取下一个处理请求对象
     */
    public IHandler getHandler(){
        return handler;
    }

    /**
     * 设置下一个处理请求对象
     */

    public void setHandler(IHandler handler) {
        this.handler = handler;
    }

    /**
     * 处理请假流程
     * @param user 当前办理人
     * @param day  请假天数
     * @return
     */
    public abstract String handleaskforleave(String user, int day);


}
