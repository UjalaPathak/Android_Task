package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mytextDisplayView = findViewById<TextView>(R.id.mytextview);

        val myredDisplayView= findViewById<TextView>(R.id.myredview);

        val mygreenDisplayView= findViewById<TextView>(R.id.mygreenview);

        val myblueDisplayView= findViewById<TextView>(R.id.myblueview);


        myredDisplayView.setOnClickListener{
            mytextDisplayView.text= "Red button is clicked";
        }
        mygreenDisplayView.setOnClickListener{
            mytextDisplayView.text= "green button is clicked";
        }
        myblueDisplayView.setOnClickListener{
            mytextDisplayView.text= "blue button is clicked";
        }


    }
}



