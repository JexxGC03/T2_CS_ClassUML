package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Clase Student ejemplo de que métodos y atributos podría tener, además de relazionar diagrama UML
 *
 * @author Jesús G
 * @version 1.0.0
 */

public class Student {

    private String name;
    private String lastName;
    private int code;
    private String email;
    private Enroll enroll;
    private List<Subject> subjects;
    private Map<Subject, Float> grades;


    /**
     * Constructor
     */
    public Student(String name, String lastName, int code, String email, Enroll enroll, List<Subject> subjects, Map<Subject, Float> grades) {
        this.name = name;
        this.lastName = lastName;
        this.code = code;
        this.email = email;
        this.enroll = null;
        this.subjects = new ArrayList<>();
        this.grades = new HashMap<>();
    }


    //Getter and Setter

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

    public Enroll getEnroll() {
        return enroll;
    }

    public void setEnroll(Enroll enroll) {
        this.enroll = enroll;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public Map<Subject, Float> getGrades() {
        return grades;
    }

    public void setGrades(Map<Subject, Float> grades) {
        this.grades = grades;
    }

    //Metods

    public void enroll(Enroll enroll){
        this.enroll = enroll;
    }

    public void addSubject(Subject subject) {
        if(this.enroll == null){
            System.out.println("You can't add subject, please pay your enroll ");
        }
        this.subjects.add(subject);
    }

    public void receiveNotes(Subject subject, float grade) {
        grades.put(subject, grade);
    }

    public float getGrade(Subject subject) {
        return grades.get(subject);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + name + '\'' +
                ", apellido='" + lastName + '\'' +
                ", código=" + code +
                ", email='" + email + '\'' +
                ", matricula=" + (enroll != null ? enroll.toString() : "null") +
                ", asignaturas=" + subjects +
                ", calificaciones=" + grades +
                '}';
    }


}
