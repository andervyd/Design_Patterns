package by.andervyd.design_patterns.behavioral.iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {

        String[] skills = {"Java", "Spring", "SQL", "Maven", "Git", "Docker"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("John", skills);

        Iterator iterator = javaDeveloper.getIterator();

        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.print("Skills: ");
        while(iterator.hasNext()) {
            System.out.print(" " + iterator.next());
        }
    }
}
