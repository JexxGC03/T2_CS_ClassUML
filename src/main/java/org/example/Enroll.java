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
    public Enroll(int ref, Student student, double totalAmount, String date) {
        this.ref = ref;
        this.student = student;
        this.subjects = new ArrayList<>();
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
        StringBuilder sb = new StringBuilder();
        sb.append("Enroll{")
                .append("ref=").append(ref)
                .append(", student=").append(student != null ? studentToString() : "null")
                .append(", subjects=").append(subjects != null ? subjectsToString() : "null")
                .append(", totalAmount=").append(totalAmount)
                .append(", date='").append(date).append('\'')
                .append('}');
        return sb.toString();
    }

    private String studentToString() {
        return student != null ? student.toString() : "null";
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
