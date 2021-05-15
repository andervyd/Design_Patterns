package by.andervyd.design_patterns.behavioral.template;

public abstract class WebsiteTemplate {

    protected void showPage() {
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    protected abstract void showPageContent();


}
