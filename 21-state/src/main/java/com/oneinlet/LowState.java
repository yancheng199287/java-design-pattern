package com.oneinlet;

/**
 * description: 状态实现类
 *
 * @author: dawn.he
 * QQ:       905845006
 * @email: dawn.he@cloudwise.com
 * @email: 905845006@qq.com
 * @date: 2019/7/20    8:26 PM
 */
public class LowState implements State {
    private ScoreContext hj;  //环境
    private String stateName; //状态名
    private int score; //分数

    public void addScore(int x) {
        score += x;
        System.out.print("加上：" + x + "分，\t当前分数：" + score);
        checkState();
        System.out.println("分，\t当前状态：" + hj.getState().getStateName());
    }

    @Override
    public String getStateName() {
        return stateName;
    }

    @Override
    public int getScore() {
        return score;
    }

    @Override
    public ScoreContext getScoreContext() {
        return hj;
    }

    public LowState(ScoreContext h) {
        hj = h;
        stateName = "不及格";
        score = 0;
    }

    public LowState(State state) {
        hj = state.getScoreContext();
        stateName = "不及格";
        score = state.getScore();
    }

    public void checkState() {
        if (score >= 90) {
            hj.setState(new HighState(this));
        } else if (score >= 60) {
            hj.setState(new MiddleState(this));
        }
    }
}

