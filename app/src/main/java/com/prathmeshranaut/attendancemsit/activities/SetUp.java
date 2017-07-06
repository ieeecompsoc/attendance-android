package com.prathmeshranaut.attendancemsit.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.prathmeshranaut.attendancemsit.R;
import com.prathmeshranaut.attendancemsit.general.ApiClient;
import com.prathmeshranaut.attendancemsit.general.ApiInterface;
import com.prathmeshranaut.attendancemsit.general.ReadingResponse;
import com.prathmeshranaut.attendancemsit.general.Student_single;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SetUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_up);

    }



}
