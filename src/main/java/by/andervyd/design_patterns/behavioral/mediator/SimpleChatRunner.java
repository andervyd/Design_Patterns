package by.andervyd.design_patterns.behavioral.mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {

        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat, "Admin");
        User userId100 = new SimpleUser(chat, "Peter_100");
        User userId101 = new SimpleUser(chat, "Bob_101");
        User userId250 = new SimpleUser(chat, "Collin_250");

        chat.setAdmin(admin);
        chat.addUserToChat(userId100);
        chat.addUserToChat(userId101);
        chat.addUserToChat(userId250);

        userId100.sendMessage("Hello, I'm Peter");
        System.out.println("----------------");
        admin.sendMessage("Hi Peter, I'm admin this site");

    }
}
