package com.prathmeshranaut.attendancemsit.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;
import com.prathmeshranaut.attendancemsit.R;
import com.prathmeshranaut.attendancemsit.adaptors.Add_instance_Adapter_Recycler;
import com.prathmeshranaut.attendancemsit.adaptors.Student_single_Adapter_Recycler;
import com.prathmeshranaut.attendancemsit.general.Add_Instance;
import com.prathmeshranaut.attendancemsit.general.RecyclerItemClickListener;
import com.prathmeshranaut.attendancemsit.general.Student_single;

import java.util.ArrayList;
import java.util.List;


public class Class_Activity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Add_Instance> add_instances;

      Add_instance_Adapter_Recycler add_instance_adapter_recycler;
    public FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_);
        recyclerView = (RecyclerView) findViewById(R.id.recycle);
        recyclerView.setHasFixedSize(true);


        add_instances = new ArrayList<>();
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReferenceFromUrl("https://mytwitter2-3f5b4.firebaseio.com/attendance_record");
        add_instance_adapter_recycler=new Add_instance_Adapter_Recycler(this,add_instances);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(add_instance_adapter_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                GenericTypeIndicator<List<Add_Instance>> t = new GenericTypeIndicator<List<Add_Instance>>() {};
                List<Add_Instance> fetch   = dataSnapshot.getValue(t);
//               for (DataSnapshot readSnapshot: dataSnapshot.getChildren()) {
//                   fetch = dataSnapshot.getValue(t);
//            }
                if (fetch != null) {
                    add_instances.clear();

                    add_instances.addAll(fetch);

                    add_instance_adapter_recycler.notifyDataSetChanged();

                }



            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Intent i = getIntent();
                        i.setClass(Class_Activity.this,MarkAttendance.class);
                        startActivity(i);

                    }

                    @Override
                    public void onLongItemClick(View view,final int position) {

                    }

                })
        );
    }
}
