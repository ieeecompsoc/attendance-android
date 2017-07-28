package com.prathmeshranaut.attendancemsit.general;

/**
 * Created by Jatin on 6/28/2017.
 */

public class Add_Instance {
    String current_date;
    String current_time;
    int no_of_absent;
    int id;
    int no_of_present;
    String teacherid;
    String studentid;

    public String getCurrent_date() {
        return current_date;
    }

    public void setCurrent_date(String current_date) {
        this.current_date = current_date;
    }

    public String getCurrent_time() {
        return current_time;
    }

    public void setCurrent_time(String current_time) {
        this.current_time = current_time;
    }

    public int getNo_of_absent() {
        return no_of_absent;
    }

    public void setNo_of_absent(int no_of_absent) {
        this.no_of_absent = no_of_absent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNo_of_present() {
        return no_of_present;
    }

    public void setNo_of_present(int no_of_present) {
        this.no_of_present = no_of_present;
    }

    public Add_Instance(int id, String current_date, String current_time, int no_of_present, int no_of_absent)
    {
        this.id=id;
        this.current_date=current_date;
        this.current_time=current_time;
     this.no_of_present=no_of_present;
        this.no_of_absent=no_of_absent;

    }
}
