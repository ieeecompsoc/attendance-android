package com.prathmeshranaut.attendancemsit.activities;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.prathmeshranaut.attendancemsit.R;
import com.prathmeshranaut.attendancemsit.adaptors.Add_instance_Adapter_Recycler;
import com.prathmeshranaut.attendancemsit.databases.attendance_record_helper_db;
import com.prathmeshranaut.attendancemsit.general.Add_Instance;
import com.prathmeshranaut.attendancemsit.general.Constants;

import java.util.ArrayList;

public class Add_instanceActivity extends AppCompatActivity {
FloatingActionButton floatingActionButton;
    Add_instance_Adapter_Recycler adapter;
    attendance_record_helper_db attendance_db;
    ArrayList<Add_Instance> add_instances;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_instance2);
        add_instances=new ArrayList<>();
        floatingActionButton=(FloatingActionButton)findViewById(R.id.floating_button);
        recyclerView = (RecyclerView) findViewById(R.id.recycle);
        recyclerView.setHasFixedSize(true);
        adapter = new Add_instance_Adapter_Recycler(Add_instanceActivity.this,add_instances);
        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(Add_instanceActivity.this));
        attendance_db = new attendance_record_helper_db(Add_instanceActivity.this);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                attendance_record_helper_db  attendance_helper=new attendance_record_helper_db(Add_instanceActivity.this);
//                SQLiteDatabase db = attendance_helper.getWritableDatabase();
//                ContentValues cv = new ContentValues();

                                // put your values here
//                cv.put();
//                cv.put();
//

//                Intent i1 = new Intent();
//                i1.setClass(Add_instanceActivity.this, Add_attendance_offline.class);
//                startActivityForResult(i1,2);

            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {


        if (requestCode == 2) {
            if (resultCode == Activity.RESULT_OK) {
                setUpViews();
                Log.i("TAG", "onActivityResult: ");
            } else if (resultCode == Activity.RESULT_CANCELED) {
                Log.i("MainActivityTag", "Result Cancelled ");
            }
        }
        else
        if(requestCode==1)
        {
            if(resultCode==Activity.RESULT_OK)
            {
                setUpViews();;
            }
            else
                Log.i("ttttttttt", "onActivityResult: ");
        }
    }

    private void setUpViews() {

        SQLiteDatabase dp = attendance_db.getReadableDatabase();
        add_instances.clear();
        Cursor c = dp.query(Constants.attendance_record_table_name, null, null, null, null, null, null);


        while (c.moveToNext()) {


            int id = c.getInt(c.getColumnIndex(Constants.attendance_record_id));
            int present=c.getInt(c.getColumnIndex(Constants.no_of_present));
            int absent=c.getInt(c.getColumnIndex(Constants.no_of_absent));


            String date = c.getString(c.getColumnIndex(Constants.date));
            String time = c.getString(c.getColumnIndex(Constants.time));

            Add_Instance addi = new Add_Instance(id,date, time,present,absent);
            add_instances.add(addi);


        }

        adapter.notifyDataSetChanged();
    }


}
