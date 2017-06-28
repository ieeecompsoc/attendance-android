package com.prathmeshranaut.attendancemsit.general;

/**
 * Created by Jatin on 6/28/2017.
 */

public class Classes {
    String name;
    String subject;
    int id;
    int number_of_students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber_of_students() {
        return number_of_students;
    }

    public void setNumber_of_students(int number_of_students) {
        this.number_of_students = number_of_students;
    }


    Classes(int id, String name, String subject, int number_of_students)
    {
            this.id=id;
            this.name=name;
            this.subject=subject;
            this.number_of_students=number_of_students;
    }
}
