package com.example.lab3_madihah_oct2021;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper {

    //Database Name
        private static final String DATABASE_NAME = "personalbiodata.db";
    //Database Version
        private static final int DATABASE_VERSION = 1;
    //Create Constructor for Data Helper
        public DataHelper (Context context){
                super(context,DATABASE_NAME,null,DATABASE_VERSION);
        }
@Override
//create table
public void onCreate (SQLiteDatabase db){
    String sql =  "create table biodata(no integer primary key, name text null,dob text null, gender text null, address text null);";
    Log.d("Data","OnCreate:"+sql);
    db.execSQL(sql);
        }
//create method to upgrade database version if database exist
@Override
public void onUpgrade (SQLiteDatabase arg0, int arg1, int arg2){
        } }
