package com.prathmeshranaut.attendancemsit.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;
import com.prathmeshranaut.attendancemsit.R;
import com.prathmeshranaut.attendancemsit.adaptors.Classes_Adapter_Recycler;
import com.prathmeshranaut.attendancemsit.adaptors.Student_single_Adapter_Recycler;
import com.prathmeshranaut.attendancemsit.general.Classes;
import com.prathmeshranaut.attendancemsit.general.Student_single;

import java.util.ArrayList;
import java.util.List;


public class MarkAttendance extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Student_single> student_singles;
    Student_single_Adapter_Recycler student_single_adapter_recycler;

    public FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mark_attendance);

        recyclerView = (RecyclerView) findViewById(R.id.recycle);
        recyclerView.setHasFixedSize(true);


        student_singles = new ArrayList<>();
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReferenceFromUrl("https://mytwitter2-3f5b4.firebaseio.com/student");
        student_single_adapter_recycler=new Student_single_Adapter_Recycler(this,student_singles);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(student_single_adapter_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                GenericTypeIndicator<List<Student_single>> t = new GenericTypeIndicator<List<Student_single>>() {};
                List<Student_single> fetch   = dataSnapshot.getValue(t);
//               for (DataSnapshot readSnapshot: dataSnapshot.getChildren()) {
//                   fetch = dataSnapshot.getValue(t);
//            }
                if (fetch != null) {
                    student_singles.clear();

                    student_singles.addAll(fetch);

                    student_single_adapter_recycler.notifyDataSetChanged();

                }



            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }
}
