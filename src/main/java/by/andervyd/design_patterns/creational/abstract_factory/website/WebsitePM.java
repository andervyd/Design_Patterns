package by.andervyd.design_patterns.creational.abstract_factory.website;

import by.andervyd.design_patterns.creational.abstract_factory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manges website project...");
    }
}
