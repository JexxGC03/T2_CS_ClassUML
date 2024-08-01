package org.example;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private String name;
    private String code;
    private int credits;
    private String description;
    private Faculty faculty;
    private Classroom classroom;


    //Constructor
    public Subject(String name, String code, int credits, String description, Faculty faculty) {
        this.name = name;
        this.code = code;
        this.credits = credits;
        this.description = description;
        this.faculty = faculty;
        this.classroom = null;
    }


    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getDescription() {
        return description;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /*
    Methods
    * */

    /*public void assignGrades(Student student, float grade) {
        if (students.contains(student)) {
            student.receiveNotes(this, grade);
        }
    }*/

    public void addClassroom(Classroom classroom) {
        this.classroom = classroom;
        classroom.addSubject(this);
    }




}
