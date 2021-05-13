package by.andervyd.design_patterns.structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {

        Project project = new ProxyProject("https://github.com/andervyd/Design_Patterns.git");
        project.run();
    }
}
