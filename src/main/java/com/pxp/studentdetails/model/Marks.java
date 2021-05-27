package com.pxp.studentdetails.model;

public class Marks {

    private int rollno;
    private String subject;
    private int mark;

    public Marks() {
    }

    public Marks(int rollno, String subject, int mark) {
        this.rollno = rollno;
        this.subject = subject;
        this.mark = mark;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
