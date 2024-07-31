package org.example;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private String name;
    private String code;
    private int credits;
    private Teacher teacher;
    private String description;
    private Faculty faculty;
    private List<Student> students;


    //Constructor
    public Subject(String name, String code, int credits, Teacher teacher, String description, List<Student> students) {
        this.name = name;
        this.code = code;
        this.credits = credits;
        this.teacher = teacher;
        this.description = description;
        this.students = new ArrayList<>();
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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    /*
    Methods
    * */

    public void addStudent(Student student) {
        students.add(student);
    }

    public void assignGrades(Student student, float grade) {
        if (students.contains(student)) {
            student.receiveNotes(this, grade);
        }
    }



    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + name + '\'' +
                ", codigo='" + code + '\'' +
                ", creditos=" + credits +
                ", teacher=" + teacher +
                ", description='" + description + '\'' +
                ", faculty=" + faculty +
                ", students=" + students +
                '}';
    }


}
