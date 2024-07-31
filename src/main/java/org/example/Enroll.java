package org.example;

import java.util.ArrayList;
import java.util.List;

public class Enroll {
    private int ref;

    private Student student;
    private List<Subject> subjects;
    private double totalAmount;
    private String date;

    //Constructor
    public Enroll(int ref, Student student, List<Subject> subjects, double totalAmount, String date) {
        this.ref = ref;
        this.student = student;
        this.subjects = subjects;
        this.totalAmount = totalAmount;
        this.date = date;
    }

    //Getters and Setters
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getRef() {
        return ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    //Methods
    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public double obtainTotalAmount() {
        double totalAmount = 0;
        for (Subject subject : subjects) {
            totalAmount += subject.getCredits() * obtainCostForCredits(subject);
        }
        return totalAmount;
    }

    private double obtainCostForCredits(Subject subject){
        Faculty faculty = subject.getFaculty();
        return faculty != null ? faculty.getCostForCredit() : 0.0;
    }


    @Override
    public String toString() {
        return "Matricula{" +
                "id=" + ref +
                ", alumno=" + student +
                ", asignaturas=" + subjects +
                ", costoTotal=" + totalAmount +
                ", fecha='" + date + '\'' +
                '}';
    }

}
