package by.andervyd.design_patterns.structural.facade;

public class BugTracker {
    private boolean activeSprint;

    public void startSprint() {
        System.out.println("Sprint is active.");
        activeSprint = true;
    }

    public void finishSprint() {
        System.out.println("Sprint isn't active.");
        activeSprint = false;
    }

    public boolean isActiveSprint() {
        return activeSprint;
    }
}
