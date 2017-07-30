package com.prathmeshranaut.attendancemsit.general;

/**
 * Created by Jatin on 6/28/2017.
 */

public class Classes {
    String name;
    String graduating_year;
    int id;
    int number_of_students;

    public String getName() {
        return name;
    }

    public String getGraduating_year() {
        return graduating_year;
    }

    public void setGraduating_year(String graduating_year) {
        this.graduating_year = graduating_year;
    }

    public void setName(String name) {
        this.name = name;
    }
       public Classes()
       {

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


    public Classes(int id, String name, String graduating_year, int number_of_students)
    {
            this.id=id;
            this.name=name;
            this.graduating_year=graduating_year;
            this.number_of_students=number_of_students;
    }
}
