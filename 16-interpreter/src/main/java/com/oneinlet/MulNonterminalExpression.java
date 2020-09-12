package com.oneinlet;

/**
 * 两数相乘
 */
public class MulNonterminalExpression implements Expression{
    private final Expression left;
    private final Expression right;

    public MulNonterminalExpression(final Expression left, final Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(final Context context) {
        return this.left.interpreter(context) * this.right.interpreter(context);
    }
}
