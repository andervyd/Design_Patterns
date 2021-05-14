package by.andervyd.design_patterns.behavioral.observer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Subscriber implements Observer {
    private String name;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy");

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + name + "." +
                "\nWe've some changes in vacancies: \n"
                + vacancies
                + "\nDate: " + sdf.format(new Date())
                + "\n------------------------\n");
    }
}
