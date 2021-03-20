package by.andervyd.design_patterns.creational.abstract_factory.banking;

import by.andervyd.design_patterns.creational.abstract_factory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code...");
    }
}
