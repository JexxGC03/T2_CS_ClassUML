package org.example;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String facultyName;

    private double costForCredit;
    private List<Subject> subjects;

    //Constructor
    public Faculty(String facultyName, double costForCredit) {
        this.facultyName = facultyName;
        this.costForCredit = costForCredit;
        this.subjects = new ArrayList<>();
    }

    //Getters and Setters
    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public double getCostForCredit() {
        return costForCredit;
    }

    public void setCostForCredit(double costForCredit) {
        this.costForCredit = costForCredit;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    //Methods

    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }
    public double obtainCostForCredit (){
        return costForCredit;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "facultyName='" + facultyName + '\'' +
                ", costForCredit=" + costForCredit +
                ", subjects=" + subjects +
                '}';
    }

}
