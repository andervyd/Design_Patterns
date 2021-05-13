package by.andervyd.design_patterns.behavioral.interpreter;

public class OrExpression implements Expression {
    private Expression expressionFirst;
    private Expression expressionSecond;

    public OrExpression(Expression expressionFirst, Expression expressionSecond) {
        this.expressionFirst = expressionFirst;
        this.expressionSecond = expressionSecond;
    }

    @Override
    public boolean interpret(String context) {
        return expressionFirst.interpret(context) ||
                expressionSecond.interpret(context);
    }
}
