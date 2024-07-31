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
        return "Aula{" +
                "nombre='" + name + '\'' +
                ", capacidad=" + capacity +
                ", ubicacion='" + ubication + '\'' +
                ", asignaturas=" + subjects +
                '}';
    }
}
