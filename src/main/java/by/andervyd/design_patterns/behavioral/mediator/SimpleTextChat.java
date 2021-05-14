package by.andervyd.design_patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat {
    private User admin;
    private List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUserToChat(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for(User allUsers : users) {
            if(allUsers != user) {
                allUsers.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}
