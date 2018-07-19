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


        // Initialize a new array adapter object
        val adapter = ArrayAdapter<String>(
                this, // Context
                android.R.layout.simple_selectable_list_item, // Layout
                values // Array
        )


        // Set the AutoCompleteTextView adapter
        actv.setAdapter(adapter)


        // Auto complete threshold
        // The minimum number of characters to type to show the drop down
        actv.threshold = 1

        // Set an item click listener for auto complete text view
        actv.onItemClickListener = AdapterView.OnItemClickListener{
            parent,view,position,id->
            val selectedItem = parent.getItemAtPosition(position).toString()
            // Display the clicked item using toast
            tv2.text= selectedItem
            Toast.makeText(applicationContext,"Selected : $selectedItem",Toast.LENGTH_SHORT).show()
        }

         // Set a dismiss listener for auto complete text view
        actv.setOnDismissListener {
            Toast.makeText(this,"Suggestion closed.",Toast.LENGTH_SHORT).show()
        }

    }
}




 