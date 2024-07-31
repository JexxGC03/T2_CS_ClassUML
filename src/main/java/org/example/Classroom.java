package org.example;

import java.util.ArrayList;
import java.util.List;

public class Classroom {

    private String name;
    private int capacity;
    private String ubication;
    private List<Subject> subjects;

    // Constructor
    public Classroom(String name, int capacity, String ubication) {
        this.name = name;
        this.capacity = capacity;
        this.ubication = ubication;
        this.subjects = new ArrayList<>();
    }

    // Methods
    public void addSubject(Subject subject) {
        if (subjects.size() < capacity) {
            subjects.add(subject);
        } else {
            System.out.println("The classroom its full");
        }
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Classroom{")
                .append("name='").append(name).append('\'')
                .append(", capacity=").append(capacity)
                .append(", ubication='").append(ubication).append('\'')
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
