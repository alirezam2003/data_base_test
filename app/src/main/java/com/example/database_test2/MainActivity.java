package com.example.database_test2;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "jkl";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flower_DB_helper db_helper = new flower_DB_helper(this);
        //test
        SQLiteDatabase db = db_helper.getWritableDatabase();
        Log.i(TAG, "data base opened");
        if (db != null && db.isOpen()) db.close();
        Log.i(TAG, "data base closed ");

    }
}