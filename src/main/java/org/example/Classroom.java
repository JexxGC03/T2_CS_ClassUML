package org.example;

import java.util.ArrayList;
import java.util.List;

public class Classroom {

    private String name;
    private int capacity;
    private String ubication;
    private List<Subject> subjects;

    // Constructor
    public Classroom(String nombre, int capacidad, String ubicacion) {
        this.name = nombre;
        this.capacity = capacidad;
        this.ubication = ubicacion;
        this.subjects = new ArrayList<>();
    }

    // Métodos
    public void agregarAsignatura(Subject subject) {
        if (subjects.size() < capacity) {
            subjects.add(subject);
        } else {
            System.out.println("El aula ha alcanzado su capacidad máxima.");
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
