package com.example.kotlinsqlite.DBHelper

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(context:Context):SQLiteOpenHelper(context , DATABASE_NAME , null , DATABASE_VER) {
    override fun onCreate(db: SQLiteDatabase?) {
        val CREATE_TABLE_QUERY:String = ("CREATE TABLE" + TABLE_NAME + "("+ COL_ID +
                "INTEGER PRIMARY KEY" + COL_NAME + "TEXT, " + COL_EMAIL + "TEXT,")
        db!!.execSQL(CREATE_TABLE_QUERY)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    companion object{
        private val DATABASE_VER = 1
        private val DATABASE_NAME = "Pauli"

        //TABLE

        private val TABLE_NAME = "Pauli"
        private val COL_ID ="Id"
        private val COL_NAME = "name"
        private val COL_EMAIL = "email"
    }
}
