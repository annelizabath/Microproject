package com.example.admin.ayurveda;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class DBHelper extends SQLiteOpenHelper {

    public static final String DBNAME="MEDITIPS";
    public static final int DBVER=1;
    public static final String TBNAME1="Memory";
    public static final String TBNAME2="Insomnia";
    public static final String TBNAME3="Bald_Head";
    public static final String TBNAME4="Headache";
    public static final String TBNAME5="Sinusitis";
    public static final String COL1="slno";
    public static final String COL2="description";
    public DBHelper(Context context) {
        super(context, DBNAME, null, DBVER);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String a="CREATE TABLE "+TBNAME1+"("+COL1+ " integer primary key,"+COL2+ " text)";
        db.execSQL(a);
        String b="CREATE TABLE "+TBNAME2+"("+COL1+ " integer primary key,"+COL2+ " text)";
        db.execSQL(b);
        String c="CREATE TABLE "+TBNAME3+"("+COL1+ " integer primary key,"+COL2+ " text)";
        db.execSQL(c);
        String d="CREATE TABLE "+TBNAME4+"("+COL1+ " integer primary key,"+COL2+ " text)";
        db.execSQL(d);
        String e="CREATE TABLE "+TBNAME5+"("+COL1+ " integer primary key,"+COL2+ " text)";
        db.execSQL(e);



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
