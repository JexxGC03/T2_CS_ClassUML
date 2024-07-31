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
        StringBuilder sb = new StringBuilder();
        sb.append("Faculty{")
                .append("facultyName='").append(facultyName).append('\'')
                .append(", costForCredit=").append(costForCredit)
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
