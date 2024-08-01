package org.example.unused;

import org.example.Subject;

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

    /*public void assignGrades(Subject subject, Student student, float grades) {
        if (subjects.contains(subject)) {
            subject.assignGrades(student, grades);
        }
    }*/

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teacher{")
                .append("name='").append(name).append('\'')
                .append(", lastName='").append(lastName).append('\'')
                .append(", email='").append(email).append('\'')
                .append(", subjects=").append(subjects != null ? subjectsToString() : "null")
                .append('}');
        return sb.toString();
    }

    private String subjectsToString() {
        if (subjects == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < subjects.size(); i++) {
            sb.append(subjects.get(i) != null ? subjects.get(i).toString() : "null");
            if (i < subjects.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }


}
