package by.andervyd.design_patterns.behavioral.visitor;

public class Project implements ProjectElement {
    ProjectElement[] projectElements;

    public Project() {
        projectElements = new ProjectElement[]{
                new ProjectClass(),
                new Database(),
                new Test()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        for(ProjectElement projectElement : projectElements) {
            projectElement.beWritten(developer);
        }
    }
}
