package com.prathmeshranaut.attendancemsit.databases;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.prathmeshranaut.attendancemsit.general.Constants;

/**
 * Created by Jatin on 6/28/2017.
 */

public class attendance_record_helper_db extends SQLiteOpenHelper {
    public attendance_record_helper_db(Context context)
    {
        super(context,  "classDb",null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createtable=" CREATE TABLE "+ Constants.attendance_record_table_name+" ( "+Constants.attendance_record_id+" INTEGER PRIMARY KEY AUTOINCREMENT, "
                +Constants.time+" TEXT "+Constants.no_of_present+" INTEGER "+Constants.no_of_absent+" INTEGER "+Constants.date+" TEXT "+Constants.student_id+" TEXT "+Constants.teacher_id+" TEXT); ";

        db.execSQL(createtable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
