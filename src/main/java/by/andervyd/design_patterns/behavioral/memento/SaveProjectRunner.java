package by.andervyd.design_patterns.behavioral.memento;

public class SaveProjectRunner {
    public static void main(String[] args) throws InterruptedException {

        Project project = new Project();
        GithubRepo github = new GithubRepo();

        System.out.println("Creating new project. Version 1.0\n");
        project.setVersionAndDate("Version 1.0");
        System.out.println(project);

        System.out.println("-------------------");

        System.out.println("Saving current version to github...");
        github.setSave(project.save());

        System.out.println("-------------------");
        Thread.sleep(5000);

        System.out.println("Updating project to Version 1.1\n");
        System.out.println("Writing poor code...\n");
        project.setVersionAndDate("Version 1.1");
        System.out.println(project);

        System.out.println("-------------------");
        Thread.sleep(5000);

        System.out.println("Something went wrong...");
        System.out.println("Rolling back to Version 1.0");
        project.load(github.getSave());

        System.out.println("-------------------");

        System.out.println("Information after rollback: ");
        System.out.println(project);
    }
}
/*
                    Creating new project. Version 1.0

            Project -
                      Version: Version 1.0
                      Date: Sat May 15 00:31:15 EEST 2021
            -------------------
            Saving current version to github...
            -------------------
            Updating project to Version 1.1

            Writing poor code...

            Project -
                      Version: Version 1.1
                      Date: Sat May 15 00:31:20 EEST 2021
            -------------------
            Something went wrong...
            Rolling back to Version 1.0
            -------------------
            Information after rollback:
            Project -
                      Version: Version 1.0
                      Date: Sat May 15 00:31:15 EEST 2021

*/
