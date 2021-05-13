package by.andervyd.design_patterns.behavioral.cor;

public class SimpleReportNotifier extends Notifier {

    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifier using simple report: " + message);
    }
}
