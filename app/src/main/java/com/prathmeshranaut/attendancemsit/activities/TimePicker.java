package com.prathmeshranaut.attendancemsit.activities;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.prathmeshranaut.attendancemsit.R;

/**
 * Created by Nitika Kamboj on 05-07-2017.
 */

public class TimePicker extends AppCompatActivity  {
    TextView timeview;
    static final int DIALOG_ID=0;
    int hour_x;
    int minute_x;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_instance);
        showTimePickerDialog();
    }

    public void showTimePickerDialog()
    {
    timeview=(TextView)findViewById(R.id.time);
    timeview.setOnClickListener(
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
     return new TimePickerDialog(this,kTimePickerListener,hour_x,minute_x,false);
     return null;
    }
   protected TimePickerDialog.OnTimeSetListener kTimePickerListener=
        new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(android.widget.TimePicker view, int hourOfDay, int minute) {
            hour_x=hourOfDay;
            minute_x=minute;
            }
        };
        }

