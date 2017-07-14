package com.prathmeshranaut.attendancemsit.activities;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

import com.prathmeshranaut.attendancemsit.R;
import com.prathmeshranaut.attendancemsit.adaptors.Add_instance_Adapter_Recycler;
import com.prathmeshranaut.attendancemsit.databases.attendance_record_helper_db;
import com.prathmeshranaut.attendancemsit.general.Constants;

import java.util.Calendar;

public class Add_instanceActivity extends AppCompatActivity {
FloatingActionButton floatingActionButton;
    String date_time="";
    int mYear;
    int mMonth;
    int mDay;

    int mHour;
    int mMinute;
    TextView timeview;
    TextView dateview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_instance2);
        timeview=(TextView)findViewById(R.id.time);
        dateview=(TextView) findViewById(R.id.date);
        floatingActionButton=(FloatingActionButton)findViewById(R.id.floating_button);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                attendance_record_helper_db  attendance_helper=new attendance_record_helper_db(Add_instanceActivity.this);
                SQLiteDatabase db = attendance_helper.getWritableDatabase();
                ContentValues cv = new ContentValues();


                // put your values here
//                cv.put();
//                cv.put();
//

                datePicker();
                db.insert(Constants.attendance_record_table_name, null, cv);
            }
        });
    }
    private void datePicker(){

        // Get Current Date
        final Calendar c = Calendar.getInstance();
        mYear = c.get(Calendar.YEAR);
        mMonth = c.get(Calendar.MONTH);
        mDay = c.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(android.widget.DatePicker view, int year, int month, int dayOfMonth) {
                        mYear=year;
                        mMonth=month;
                        mDay=dayOfMonth;
                        dateview.setText(dayOfMonth + "-" + (month + 1) + "-" + year);
                        //*************Call Time Picker Here ********************
                        timePicker();
                    }
                }, mYear, mMonth, mDay);
        datePickerDialog.show();
    }
    private void timePicker(){
        // Get Current Time
        final Calendar c = Calendar.getInstance();
        mHour = c.get(Calendar.HOUR_OF_DAY);
        mMinute = c.get(Calendar.MINUTE);

        // Launch Time Picker Dialog
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener() {

                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                        mHour = hourOfDay;
                        mMinute = minute;

                        timeview.setText(date_time+" "+hourOfDay + ":" + minute);
                    }
                }, mHour, mMinute, false);
        timePickerDialog.show();
    }
}
