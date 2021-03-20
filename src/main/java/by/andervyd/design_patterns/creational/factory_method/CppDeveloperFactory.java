package by.andervyd.design_patterns.creational.factory_method;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
