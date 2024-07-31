package org.example;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    private String name;
    private String lastName;
    private String email;
    private List<Subject> subjects;

    //Constructor
    public Teacher(String name, String lastName, String email) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.subjects = new ArrayList<>();
    }


    //Setters and Getters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }


    //Methods
    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public void assignGrades(Subject subject, Student student, float grades) {
        if (subjects.contains(subject)) {
            subject.assignGrades(student, grades);
        }
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", subjects=" + subjects +
                '}';
    }


}
