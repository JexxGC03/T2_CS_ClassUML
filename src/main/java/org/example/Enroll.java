package org.example;

import org.example.unused.Student;

import java.util.ArrayList;
import java.util.List;

public class Enroll {

    private int ref;
    private Student student;
    private double totalAmount;
    private String date;

    private List<GroupUCA> groups;

    //Constructor

    public Enroll(int ref, Student student, double totalAmount, String date) {
        this.ref = ref;
        this.student = student;
        this.totalAmount = totalAmount;
        this.date = date;
        this.groups = new ArrayList<>();
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

    public List<GroupUCA> getGroups() {
        return groups;
    }

    public void setGroups(List<GroupUCA> groups) {
        this.groups = groups;
    }

    //Methods


    private double obtainCostForCredits(Subject subject){
        Faculty faculty = subject.getFaculty();
        return faculty != null ? faculty.getCostForCredit() : 0.0;
    }




}
