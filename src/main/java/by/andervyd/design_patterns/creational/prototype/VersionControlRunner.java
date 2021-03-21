package by.andervyd.design_patterns.creational.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project
                (1, "SuperProject", "SourceCode sourceCode = new SourceCode();");
        System.out.println(master);

        // Clone:

        // Not correct type
        Project masterClone = (Project) master.copy();
        System.out.println(masterClone);

        // More correct
        ProjectFactory factory = new ProjectFactory(master);
        Project newMasterClone = factory.cloneProject();
        System.out.println(newMasterClone);
    }
}
