package by.andervyd.design_patterns.structural.proxy;

public class ProxyProject implements Project {
    private String url;
    private RealProject project;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if(project == null) {
            project = new RealProject(url);
        }
        project.run();
    }
}
