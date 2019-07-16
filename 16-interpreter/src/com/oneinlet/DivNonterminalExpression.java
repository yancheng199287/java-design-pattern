package com.oneinlet;

/**
 * 两数之商
 */
public class DivNonterminalExpression implements Expression {
    private final Expression left;
    private final Expression right;

    public DivNonterminalExpression(final Expression left, final Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(final Context context) {
        final int value = this.right.interpreter(context);
        if (value != 0) {
            return this.left.interpreter(context) / value;
        }
        return -1111;
    }

}
