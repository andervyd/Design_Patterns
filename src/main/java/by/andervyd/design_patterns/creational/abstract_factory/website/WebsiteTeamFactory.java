package by.andervyd.design_patterns.creational.abstract_factory.website;

import by.andervyd.design_patterns.creational.abstract_factory.Developer;
import by.andervyd.design_patterns.creational.abstract_factory.ProjectManager;
import by.andervyd.design_patterns.creational.abstract_factory.ProjectTeamFactory;
import by.andervyd.design_patterns.creational.abstract_factory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
