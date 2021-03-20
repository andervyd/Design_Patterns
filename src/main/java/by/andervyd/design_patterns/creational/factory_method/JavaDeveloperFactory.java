package by.andervyd.design_patterns.creational.factory_method;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
