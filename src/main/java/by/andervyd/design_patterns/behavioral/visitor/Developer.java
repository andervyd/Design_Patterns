package by.andervyd.design_patterns.behavioral.visitor;

public interface Developer {

    void create(ProjectClass projectClass);

    void create(Database database);

    void create(Test test);
}
