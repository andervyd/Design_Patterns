package by.andervyd.design_patterns.behavioral.template;

public class NewsPage extends WebsiteTemplate {

    @Override
    protected void showPageContent() {
        System.out.println("News");
    }
}
