package com.oneinlet;

/**
 * description: 上下文环境
 *
 * @author: dawn.he
 * QQ:       905845006
 * @email: dawn.he@cloudwise.com
 * @email: 905845006@qq.com
 * @date: 2019/7/20    8:25 PM
 */
public class ScoreContext {

    private State state;

    /**
     * 定义环境类的初始状态
     */
    public ScoreContext() {
        this.state = new LowState(this);
    }

    /**
     * 设置状态
     */

    public void setState(State state) {
        this.state = state;
    }

    /**
     * 读取状态
     */
    public State getState() {
        return state;
    }

    /**
     * 委托状态接口处理请求
     */
    public void add(int score) {
        state.addScore(score);
    }
}

