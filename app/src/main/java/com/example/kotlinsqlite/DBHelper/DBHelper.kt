package com.example.kotlinsqlite.DBHelper

import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.kotlinsqlite.Model.Person

class DBHelper(context:Context):SQLiteOpenHelper(context , DATABASE_NAME , null , DATABASE_VER) {

    companion object{
        private val DATABASE_VER = 1
        private val DATABASE_NAME = "Pauli"

        //TABLE
        private val TABLE_NAME = "Pauli"
        private val COL_ID ="Id"
        private val COL_NAME = "name"
        private val COL_EMAIL = "email"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val CREATE_TABLE_QUERY:String = ("CREATE TABLE $TABLE_NAME + ( $COL_ID INTEGER PRIMARY KEY, $COL_NAME TEXT, $COL_EMAIL TEXT)")
        db!!.execSQL(CREATE_TABLE_QUERY)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

        db!!.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db!!)
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    val allPerson:List<Person>

    get(){
        val lstPerson = ArrayList<Person>()
        val selectQuery = "SELECT * FROM $TABLE_NAME"
        val db:SQLiteDatabase = this.writableDatabase
        val cursor: Cursor = db.rawQuery(selectQuery , null)
        if (cursor.moveToFirst()){
            do {
                val person = Person()
                person.id = cursor.getInt(cursor.getColumnIndex(COL_ID))
                person.name = cursor.getString(cursor.getColumnIndex(COL_NAME))
                person.email = cursor.getString(cursor.getColumnIndex(COL_EMAIL))

                lstPerson.add(person)
            }
        }


    }
}
