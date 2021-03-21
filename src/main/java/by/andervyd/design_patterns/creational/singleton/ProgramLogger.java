package by.andervyd.design_patterns.creational.singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = "Log file: \n\n";

    public static synchronized ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    private ProgramLogger() {
        // default constructor
    }

    public void addLogInfo(String logInfo) {
        logFile += logInfo + "\n";
    }

    public void showLogFile() {
        System.out.println(logFile);
    }
}
