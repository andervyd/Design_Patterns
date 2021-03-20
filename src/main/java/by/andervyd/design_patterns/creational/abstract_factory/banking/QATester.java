package by.andervyd.design_patterns.creational.abstract_factory.banking;

import by.andervyd.design_patterns.creational.abstract_factory.Tester;

public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA tester tests banking code...");
    }
}
