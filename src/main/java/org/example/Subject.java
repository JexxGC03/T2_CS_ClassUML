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
    private Classroom classroom;


    //Constructor
    public Subject(String name, String code, int credits, Teacher teacher, String description, Faculty faculty) {
        this.name = name;
        this.code = code;
        this.credits = credits;
        this.teacher = teacher;
        this.description = description;
        this.faculty = faculty;
        this.students = new ArrayList<>();
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

    public void addClassroom(Classroom classroom) {
        this.classroom = classroom;
        classroom.addSubject(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Subject{")
                .append("name='").append(name).append('\'')
                .append(", code='").append(code).append('\'')
                .append(", credits=").append(credits)
                .append(", teacher=").append(teacher != null ? teacher.toString() : "null")
                .append(", description='").append(description).append('\'')
                .append(", faculty=").append(faculty != null ? faculty.toString() : "null")
                .append(", students=").append(students != null ? studentsToString() : "null")
                .append(", classroom=").append(classroom != null ? classroom.toString() : "null")
                .append('}');
        return sb.toString();
    }

    private String studentsToString() {
        if (students == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < students.size(); i++) {
            sb.append(students.get(i) != null ? students.get(i).toString() : "null");
            if (i < students.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }


}
