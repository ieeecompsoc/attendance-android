package com.prathmeshranaut.attendancemsit.activities;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.prathmeshranaut.attendancemsit.R;

/**
 * Created by Nitika Kamboj on 06-07-2017.
 */

public class DatePicker extends AppCompatActivity {
TextView dateview;
static final int DIALOG_ID=0;
        int year_x;
        int month_x;
        int day_x;
@Override
protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_instance);
        showDatePickerDialog();
        }

public void showDatePickerDialog()
        {
        dateview=(TextView)findViewById(R.id.date);
        dateview.setOnClickListener(
        new View.OnClickListener()
        {
public void onClick(View v)
        {
        showDialog(DIALOG_ID);
        }
        }
        );
        }
protected Dialog onCreateDialog(int id)
        {
        if(id==DIALOG_ID)
        return new DatePickerDialog(this,dDatePickerListener, year_x, month_x, day_x);
        return null;
        }
protected DatePickerDialog.OnDateSetListener dDatePickerListener=
        new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(android.widget.DatePicker view, int year, int month, int dayOfMonth) {
             year_x=year;
             month_x=month;
             day_x=dayOfMonth;
            }
        };
}
