package com.prathmeshranaut.attendancemsit.general;

/**
 * Created by Jatin on 6/28/2017.
 */

public class Student_single {
    String name;
    int rollno;
    int present;
    int absent;
    int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getPresent() {
        return present;
    }

    public void setPresent(int present) {
        this.present = present;
    }

    public int getAbsent() {
        return absent;
    }

    public void setAbsent(int absent) {
        this.absent = absent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    Student_single(int id, String name, int rollno, int present, int absent)
    {
        this.id=id;

        this.name=name;
        this.rollno=rollno;
        this.present=present;
        this.absent=absent;
    }

}
