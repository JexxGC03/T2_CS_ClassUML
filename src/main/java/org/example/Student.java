package org.example;

import java.util.List;

public class Student {

    private String name;
    private String lastName;
    private int code;
    private String email;
    private List<Subject> subjects;


    /**
     * Constructor
     */
    public Student(String name, String lastName, int code, String email, List<Subject> subjects) {
        this.name = name;
        this.lastName = lastName;
        this.code = code;
        this.email = email;
        this.subjects = subjects;
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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }




}
