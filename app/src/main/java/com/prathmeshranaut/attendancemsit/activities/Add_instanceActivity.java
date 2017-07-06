package com.prathmeshranaut.attendancemsit.activities;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.prathmeshranaut.attendancemsit.R;
import com.prathmeshranaut.attendancemsit.adaptors.Add_instance_Adapter_Recycler;
import com.prathmeshranaut.attendancemsit.databases.attendance_record_helper_db;
import com.prathmeshranaut.attendancemsit.general.Constants;

public class Add_instanceActivity extends AppCompatActivity {
FloatingActionButton floatingActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_instance2);
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


                db.insert(Constants.attendance_record_table_name, null, cv);
            }
        });
    }
}
