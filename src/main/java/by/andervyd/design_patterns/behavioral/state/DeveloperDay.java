package by.andervyd.design_patterns.behavioral.state;

public class DeveloperDay {
    public static void main(String[] args) throws InterruptedException {

        Activity activity = new Sleeping();

        Developer developer = new Developer();
        developer.setActivity(activity);

        for(int i = 0; i < 8; i++) {
            developer.justDoIt();
            developer.changeActivity();
            System.out.println("--------------");
        }
    }
}
