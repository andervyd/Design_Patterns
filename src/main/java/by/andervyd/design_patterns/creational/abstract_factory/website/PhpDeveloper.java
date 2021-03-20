package by.andervyd.design_patterns.creational.abstract_factory.website;

import by.andervyd.design_patterns.creational.abstract_factory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
