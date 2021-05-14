package by.andervyd.design_patterns.behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {

        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("Junior Java Developer");
        jobSite.addVacancy("Middle Java Developer");

        Subscriber john75 = new Subscriber("John");
        Subscriber it_bob = new Subscriber("Bob");
        Subscriber molly_l = new Subscriber("Molly");

        jobSite.addObserver(john75);
        jobSite.addObserver(it_bob);
        jobSite.addObserver(molly_l);

        jobSite.addVacancy("IT manager");

        jobSite.removeVacancy("Junior Java Developer");
    }
}
/*
        Dear John.
        We've some changes in vacancies:
        [Junior Java Developer, Middle Java Developer, IT manager]
        Date: 15-May-21
        ------------------------

        Dear Bob.
        We've some changes in vacancies:
        [Junior Java Developer, Middle Java Developer, IT manager]
        Date: 15-May-21
        ------------------------

        Dear Molly.
        We've some changes in vacancies:
        [Junior Java Developer, Middle Java Developer, IT manager]
        Date: 15-May-21
        ------------------------

        Dear John.
        We've some changes in vacancies:
        [Middle Java Developer, IT manager]
        Date: 15-May-21
        ------------------------

        Dear Bob.
        We've some changes in vacancies:
        [Middle Java Developer, IT manager]
        Date: 15-May-21
        ------------------------

        Dear Molly.
        We've some changes in vacancies:
        [Middle Java Developer, IT manager]
        Date: 15-May-21
        ------------------------
*/