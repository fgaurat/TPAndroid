package com.dmr.mysqliteapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by fgaurat on 16/04/15.
 */
public class CustomerBDD  extends SQLiteOpenHelper{

    private static final String TABLE_CUST = "customers";
    private static final String COL_ID = "ID";
    private static final String COL_NOM = "NOM";
    private static final String COL_PRENOM = "PRENOM";


    private static final String CREATE_BDD = "CREATE TABLE " +TABLE_CUST +
                                                " (" + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL_NOM + " TEXT NOT NULL, " + COL_PRENOM +
                                                " TEXT NOT NULL);";

    public CustomerBDD(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_BDD);

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE " + TABLE_CUST);
        onCreate(db);
    }


}
