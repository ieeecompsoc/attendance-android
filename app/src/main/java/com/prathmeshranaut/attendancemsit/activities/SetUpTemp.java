package com.prathmeshranaut.attendancemsit.activities;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.prathmeshranaut.attendancemsit.R;
import com.prathmeshranaut.attendancemsit.adaptors.Classes_Adapter_Recycler;
import com.prathmeshranaut.attendancemsit.general.Classes;

import java.util.ArrayList;
import java.util.Map;
import java.util.logging.StreamHandler;

public class SetUpTemp extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Classes> classes;
    Classes_Adapter_Recycler classes_adapter_recycler;
    public FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_up_temp);

        recyclerView = (RecyclerView) findViewById(R.id.recycle);
        recyclerView.setHasFixedSize(true);


        classes = new ArrayList<>();
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReferenceFromUrl("https://mytwitter2-3f5b4.firebaseio.com/class");
        classes_adapter_recycler=new Classes_Adapter_Recycler(this,classes);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(classes_adapter_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                ArrayList<Classes> fetch = (ArrayList<Classes>)dataSnapshot.getValue();
//                Map<Integer, Classes> map = (Map<Integer, Classes>) dataSnapshot.getValue();

                if (fetch != null) {
                    classes.clear();

                    classes.addAll(fetch);

                    classes_adapter_recycler.notifyDataSetChanged();

                }



            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }
}
