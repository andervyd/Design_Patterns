package by.andervyd.design_patterns.behavioral.state;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Developer {
    private Activity activity;
    private final int MIN = 30;
    private final int MAX = 45;
    private SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() throws InterruptedException {
        if (activity instanceof Sleeping) {
            Thread.sleep(changeTimeForActivity());
            System.out.println("Time: " + dateForActivity());
            setActivity(new Training());
        } else if (activity instanceof Training) {
            Thread.sleep(changeTimeForActivity());
            System.out.println("Time: " + dateForActivity());
            setActivity(new Coding());
        } else if (activity instanceof Coding) {
            Thread.sleep(changeTimeForActivity());
            System.out.println("Time: " + dateForActivity());
            setActivity(new Reading());
        } else if (activity instanceof Reading) {
            Thread.sleep(changeTimeForActivity());
            System.out.println("Time: " + dateForActivity());
            setActivity(new Sleeping());
        }
    }

    public int changeTimeForActivity() {
        return (int) Math.floor((Math.random() * (MAX - MIN + 1) + MIN) * 100);
    }

    public String  dateForActivity() {
        return sdf.format(new Date());
    }

    public void justDoIt() {
        activity.justDoIt();
    }
}
