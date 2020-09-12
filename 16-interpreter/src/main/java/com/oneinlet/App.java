package com.oneinlet;

/**
 * 解释器模式（Interpreter Pattern）提供了评估语言的语法或表达式的方式，它属于行为型模式。
 * 如果一种特定类型的问题发生的频率足够高，那么可能就值得将该问题的各个实例表述为一个简单语言中的句子。
 * 这样就可以构建一个解释器，该解释器通过解释这些句子来解决该问题。而且当语法简单、效率不是关键问题的时候效果最好。
 */
public class App {
    public static void main(String[] args) {


        //设置变量、常量  并为变量赋值
        final Context context = new Context();
        context.addValue("a", 7);
        context.addValue("b", 8);
        context.addValue("c", 3);

        //运算，对句子的结构由我们自己来分析，构造
        final MulNonterminalExpression multiplyValue = new MulNonterminalExpression(
                new TerminalExpression(context.getValue("a")), new TerminalExpression(context.getValue("b")));

        final SubNonterminalExpression subtractValue = new SubNonterminalExpression(
                new TerminalExpression(context.getValue("a")), new TerminalExpression(context.getValue("b")));

        final AddtNonterminalExpression addValue = new AddtNonterminalExpression(subtractValue,
                new TerminalExpression(context.getValue("c")));

        final DivNonterminalExpression divisionValue = new DivNonterminalExpression(multiplyValue,
                addValue);

        // (a*b)/(a-b+c)
        System.out.println("运算结果为：" + divisionValue.interpreter(context));

    }
}
