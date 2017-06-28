package com.prathmeshranaut.attendancemsit.databases;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.SyncStateContract;

import com.prathmeshranaut.attendancemsit.general.Constants;

/**
 * Created by Jatin on 6/28/2017.
 */

public class class_helper_db extends SQLiteOpenHelper {

    public class_helper_db(Context context)
    {
        super(context,  "classDb",null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String createtable=" CREATE TABLE "+Constants.teacher_table_name+" ( "+Constants.teacher_id+" INTEGER PRIMARY KEY AUTOINCREMENT, "
                +Constants.teacher_password+" TEXT); ";

        db.execSQL(createtable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
