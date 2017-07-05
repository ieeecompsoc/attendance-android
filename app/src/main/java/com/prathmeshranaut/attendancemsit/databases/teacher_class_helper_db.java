package com.prathmeshranaut.attendancemsit.databases;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.prathmeshranaut.attendancemsit.general.Constants;

/**
 * Created by Jatin on 6/28/2017.
 */

public class teacher_class_helper_db extends SQLiteOpenHelper {
    public teacher_class_helper_db(Context context)
    {
        super(context,  "classDb",null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createtable=" CREATE TABLE "+ Constants.teacger_class_table_name+" ( "+Constants.teacher_class_id+" INTEGER PRIMARY KEY AUTOINCREMENT, "
                + Constants.teacher_id+" TEXT, "+Constants.class_id+" TEXT); ";

        db.execSQL(createtable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
