package by.andervyd.design_patterns.creational.abstract_factory.banking;

import by.andervyd.design_patterns.creational.abstract_factory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manges banking project...");
    }
}
