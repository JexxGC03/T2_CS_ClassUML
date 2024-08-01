package org.example.CRUD;

import org.example.User;

import java.util.ArrayList;
import java.util.List;

public class CRUD {
    private List<User> users;

    public CRUD() {
        this.users = new ArrayList<>();
    }

    //Create
    public void addUser(User user) {
        this.users.add(user);
    }

    //Read
    public User readUser(int cc){
        for (User user : users) {
            if(user.getCc() == cc) {
                return user;
            }
        }
        return null;
    }

    //Upload
    public boolean uploadUser(int cc, User uluser){
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getCc() == cc) {
                users.set(i, uluser);
                return true;
            }
        }
        return false;
    }

    //Delete
    public boolean deleteUser(int cc){
        return users.removeIf(user -> user.getCc() == cc);
    }
}
