package by.andervyd.design_patterns.structural.facade;

public class Workflow {

    Job job =new Job();
    BugTracker bugTracker = new BugTracker();
    Developer developer = new Developer();

    public void solvedProblems() {
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }

    public void endedProblems() {
        job.doJob();
        bugTracker.finishSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }
}
