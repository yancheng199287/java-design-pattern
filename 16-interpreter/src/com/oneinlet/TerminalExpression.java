package com.oneinlet;

public class TerminalExpression implements Expression {
    private final int i;

    public TerminalExpression(final int i) {
        this.i = i;
    }

    @Override
    public int interpreter(final Context context) {
        return this.i;
    }

}
