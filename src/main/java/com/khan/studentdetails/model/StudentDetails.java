package com.khan.studentdetails.model;

import java.util.Map;

public class StudentDetails {

    private int rollno;
    private String firstName;
    private String lastName;
    private Map<String, Integer> subjectMark;

    public StudentDetails() {
    }

    public StudentDetails(int rollno, String firstName, String lastName, Map<String, Integer> subjectMark) {
        this.rollno = rollno;
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjectMark = subjectMark;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Map<String, Integer> getSubjectMark() {
        return subjectMark;
    }

    public void setSubjectMark(Map<String, Integer> subjectMark) {
        this.subjectMark = subjectMark;
    }
}
