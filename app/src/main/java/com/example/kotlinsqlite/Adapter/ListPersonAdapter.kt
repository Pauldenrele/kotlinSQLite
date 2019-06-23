package com.example.kotlinsqlite.Adapter

import android.app.Activity
import android.app.Person
import android.content.Context
import android.text.Layout
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.EditText

class ListPersonAdapter(internal var activity: Activity,
                        internal var lstPerson:List<Person>,
                        internal  var edt_id:EditText ,
                        internal var edt_name:EditText ,
                        internal  var edt_email:EditText):BaseAdapter(){

    internal var inflater:LayoutInflater

    init {
        inflater = activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

    }

    override fun getItem(position: Int): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemId(position: Int): Long {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}