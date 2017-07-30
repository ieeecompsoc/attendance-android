package com.prathmeshranaut.attendancemsit.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.prathmeshranaut.attendancemsit.R;
import com.prathmeshranaut.attendancemsit.adaptors.Student_single_Adapter_Recycler;
import com.prathmeshranaut.attendancemsit.general.Student_single;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class StudentsActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Student_single> student;
    Student_single_Adapter_Recycler student_single_adapter_recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);
        recyclerView = (RecyclerView) findViewById(R.id.students_recyclerview);
        recyclerView.setHasFixedSize(true);
        student=new ArrayList<>();

        student_single_adapter_recycler=new Student_single_Adapter_Recycler(this,student);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(student_single_adapter_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

//        FetchStudentsC();
    }

}
