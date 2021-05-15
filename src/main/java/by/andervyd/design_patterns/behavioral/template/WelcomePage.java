package by.andervyd.design_patterns.behavioral.template;

public class WelcomePage extends WebsiteTemplate {

    @Override
    protected void showPageContent() {
        System.out.println("Welcome");
    }
}
