package com.prathmeshranaut.attendancemsit.general;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/**
 * Created by Jatin on 7/3/2017.
 */

public interface ApiInterface {

    @GET("values/Sheet1!A1:D5")
    public Call<ArrayList<ReadingResponse>> showsettings(@Header("spreadsheetId") String header);
    @GET("values/Sheet1!A1:D3?majorDimension=COLUMNS")
    public Call<ArrayList<Student_single>> showsettingsC(@Header("spreadsheetId") String header);

}

