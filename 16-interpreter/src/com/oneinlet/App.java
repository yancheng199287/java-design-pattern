package com.oneinlet;

/**
 *
 * 解释器模式（Interpreter Pattern）提供了评估语言的语法或表达式的方式，它属于行为型模式。
 * 这种模式实现了一个表达式接口，该接口解释一个特定的上下文。这种模式被用在 SQL 解析、符号处理引擎等。
 * 定义语言的文法，并且建立一个解释器来解释该语言中的句子。它属于类的行为模式。这里的语言意思是使用规定格式和语法的代码。
 */
public class App {
    public static void main(String[] args) {

        // (a*b)/(a-b+c)
        final Context context = new Context();
        context.addValue("a", 7);
        context.addValue("b", 8);
        context.addValue("c", 3);

        final MulNonterminalExpression multiplyValue = new MulNonterminalExpression(
                new TerminalExpression(context.getValue("a")), new TerminalExpression(context.getValue("b")));

        final SubNonterminalExpression subtractValue = new SubNonterminalExpression(
                new TerminalExpression(context.getValue("a")), new TerminalExpression(context.getValue("b")));

        final AddtNonterminalExpression addValue = new AddtNonterminalExpression(subtractValue,
                new TerminalExpression(context.getValue("c")));

        final DivNonterminalExpression divisionValue = new DivNonterminalExpression(multiplyValue,
                addValue);

        System.out.println(divisionValue.interpreter(context));

    }
}
