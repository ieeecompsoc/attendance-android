package com.prathmeshranaut.attendancemsit.general;

/**
 * Created by Jatin on 6/28/2017.
 */

public class Student_single {
    String name;
    int Sno;
    int present;
    int absent;
    int class_id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSno() {
        return Sno;
    }

    public void setSno(int sno) {
        Sno = sno;
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

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    Student_single()
    {
    }
    Student_single(int class_id, String name, int Sno, int present, int absent)
    {
        this.class_id=class_id;
        this.name=name;
        this.Sno=Sno;
        this.present=present;
        this.absent=absent;
    }
}
