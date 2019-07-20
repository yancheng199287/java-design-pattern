package com.oneinlet;

/**
 * description: 状态接口
 *
 * @author: dawn.he
 * QQ:       905845006
 * @email: dawn.he@cloudwise.com
 * @email: 905845006@qq.com
 * @date: 2019/7/20    8:24 PM
 */
public interface State {
    //检查当前状态
    void checkState();
    void addScore(int x);
    String getStateName();
    int getScore();
    ScoreContext getScoreContext();

}
