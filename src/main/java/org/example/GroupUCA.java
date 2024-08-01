package org.example;

import java.util.ArrayList;
import java.util.List;

public class GroupUCA {
    private int gp;
    private List<Subject> subjects;
    private String schedule;
    private Classroom classroom;


    //Constructor
    public GroupUCA(int gp, String schedule, Classroom classroom) {
        this.gp = gp;
        this.schedule = schedule;
        this.classroom = classroom;
    }

    //Setters and Getters

    public String getSchedule() {
        return schedule;
    }
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public int getGp() {
        return gp;
    }

    public void setGp(int gp) {
        this.gp = gp;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return "GroupUCA{" +
                "gp=" + gp +
                ", subjects=" + subjects +
                ", schedule='" + schedule + '\'' +
                ", classroom=" + classroom +
                '}';
    }

}
