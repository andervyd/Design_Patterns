package by.andervyd.design_patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJobSite implements Observed {
    private List<String> vacancies = new ArrayList<>();
    private List<Observer> subscribers = new ArrayList<>();

    public void addVacancy(String vacancy) {
        vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String vacancy) {
        vacancies.remove(vacancy);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : subscribers) {
            observer.handleEvent(vacancies);
        }
    }
}
