package by.andervyd.design_patterns.behavioral.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {

        Expression isJava = getJavaExpression();
        Expression isJavaEE = getJavaEEExpression();

        System.out.println("Does developer knows Java Core: " + isJava.interpret("Only Java Core"));
        System.out.println("--------------------");
        System.out.println("Does developer knows Java EE: " + isJavaEE.interpret("Java and Spring"));
    }

    public static Expression getJavaExpression() {
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java Core");

        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEEExpression() {
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");

        return new AndExpression(java, spring);
    }
}
