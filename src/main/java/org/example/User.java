package org.example;

import javax.management.relation.Role;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String lastName;

    private int cc;

    private String email;
    private List<GroupUCA> groups;
    private String role;



    //Constructor
    public User(String name, String lastName, int cc, String email, String role) {
        this.name = name;
        this.lastName = lastName;
        this.cc = cc;
        this.email = email;
        this.groups = new ArrayList<>();
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<GroupUCA> getGroups() {
        return groups;
    }

    public void setGroups(List<GroupUCA> groups) {
        this.groups = groups;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cc=" + cc +
                ", email='" + email + '\'' +
                ", groups=" + groups +
                ", role='" + role + '\'' +
                '}';
    }



}
