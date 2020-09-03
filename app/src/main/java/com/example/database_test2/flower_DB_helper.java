package com.example.database_test2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class flower_DB_helper extends SQLiteOpenHelper {

    private static final String DB_name = "DATA_BASE_1";
    private static final int DB_version = 1;
    private static final String DB_table_name = "TABLE_1";
    private static final String CMD = " CREATE TABLE IF NOT EXISTS [" + DB_table_name + "] (" +
            " [ " + flower_model.key_id + "  ]  INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n" +
            "[" + flower_model.key_name + "] TEXT NOT NULL,\n" +
            "[" + flower_model.key_pic + "] TEXT NOT NULL" +
            " )";
    public static final String TAG = "jkl";

    public flower_DB_helper(@Nullable Context context) {
        super(context, DB_name, null, DB_version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CMD);
        Log.i(TAG, "Database created :)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + DB_table_name);
        Log.i(TAG, " table dropped");
        onCreate(db);
    }
}
