package by.andervyd.design_patterns.behavioral.visitor;

public class ProjectRunner {
    public static void main(String[] args) {

        Project project = new Project();

        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        System.out.println("Junior in action...\n");
        project.beWritten(junior);

        System.out.println("----------------------");

        System.out.println("Senior in action...\n");
        project.beWritten(senior);
    }
}
