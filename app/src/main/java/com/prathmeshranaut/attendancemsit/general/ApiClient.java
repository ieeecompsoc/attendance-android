package com.prathmeshranaut.attendancemsit.general;

import java.lang.reflect.Modifier;



import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Modifier;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by Jatin on 7/2/2017.
 */

public class ApiClient {

    public  static  ApiInterface apiInterface;
    private static Gson gson= new GsonBuilder().excludeFieldsWithModifiers(Modifier.TRANSIENT).create();
    public static ApiInterface getApiInterface()
    {
        if(apiInterface!=null)
            return apiInterface;
        else
        {
            Retrofit retrofit = new Retrofit.Builder().baseUrl("https://sheets.googleapis.com/v4/spreadsheets/")



                    .addConverterFactory(GsonConverterFactory.create(gson)).client(new OkHttpClient())
                    .build();

            apiInterface=retrofit.create(ApiInterface.class);
            return apiInterface;
        }
    }
}
