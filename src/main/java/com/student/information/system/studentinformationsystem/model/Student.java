package com.student.information.system.studentinformationsystem.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "students")
public class Student {
    @Id
    private String id;
    private String name;
    private long studentNumber;
    private String email;
    private List<String> courseList;
    private float gpa;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getStudentNumber() {
        return studentNumber;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getCourseList() {
        return courseList;
    }

    public float getGpa() {
        return gpa;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentNumber(long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCourseList(List<String> courseList) {
        this.courseList = courseList;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }


}
