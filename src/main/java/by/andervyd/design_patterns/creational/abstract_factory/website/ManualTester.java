package by.andervyd.design_patterns.creational.abstract_factory.website;

import by.andervyd.design_patterns.creational.abstract_factory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website code...");
    }
}
