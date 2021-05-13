package by.andervyd.design_patterns.behavioral.cor;

public class BugTracker {
    public static void main(String[] args) {

        Notifier simpleNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        simpleNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        simpleNotifier.notifierManager("Everything is OK.", Priority.ROUTINE);
        System.out.println("-----------------------------");
        simpleNotifier.notifierManager("Something does wrong!", Priority.IMPORTANT);
        System.out.println("-----------------------------");
        simpleNotifier.notifierManager("Houston, We have problems", Priority.ASAP);

    }
}
