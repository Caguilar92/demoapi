package com.example.demoapi.models;

/**
 * @author Candelario Aguilar Torres
 **/
public class Student {

    private String firstname;
    private String lastname;
    private long studentId;
    private double gpa;


    public Student(String firstname, String lastname, long studentId, double gpa) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.studentId = studentId;
        this.gpa = gpa;
    }


    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public long getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }
}
