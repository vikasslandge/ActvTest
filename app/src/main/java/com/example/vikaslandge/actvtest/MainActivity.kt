package com.example.vikaslandge.actvtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val values = resources.getStringArray(R.array.states)
        val myadapter = ArrayAdapter <String> (this@MainActivity,
                android.R.layout.simple_list_item_single_choice,values)
        actv.setAdapter(myadapter)
        actv.threshold=1
        actv.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{

            //Toast.makeText(this,"Not selected",Toast.LENGTH_LONG).show()

            override fun onNothingSelected(parent: AdapterView<*>?) {

                Toast.makeText(this@MainActivity,"Not selected",Toast.LENGTH_LONG).show()
             }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, id: Long) {

                Toast.makeText(this@MainActivity,values[p2].toString() ,Toast.LENGTH_LONG).show()
                //tv2.text = values[p2]

                     }
                }
    }
}

 