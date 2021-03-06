package by.andervyd.design_patterns.behavioral.interpreter;

public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }

/*
    @Override
    public boolean interpret(String context) {
        if(context.contains(data)) {
            return true;
        }
        return false;
    }
*/
}
