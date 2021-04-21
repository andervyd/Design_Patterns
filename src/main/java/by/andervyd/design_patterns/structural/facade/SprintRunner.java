package by.andervyd.design_patterns.structural.facade;

public class SprintRunner {
    public static void main(String[] args) {

        Workflow workflow = new Workflow();
        workflow.solvedProblems();

        System.out.println("-----------");

        workflow.endedProblems();

    }
}
