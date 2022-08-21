package com.example.firsthelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.graphics.blue
// this Kotline file is to be handling by user interaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // show the layout file: activity_main
        setContentView(R.layout.activity_main)


        //display customized text to show hello from name
        // user can tap a button to change the text color of the label.
        //1. Add a button to our layout

        // Get a reference to button
        //2. set up logic to know when user has tapped on button.
        findViewById<Button>(R.id.button).setOnClickListener {

            Log.i("Noel", "Tapped on button")
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
        }

        findViewById<Button>(R.id.button2).setOnClickListener {


            Log.i("Noel", "Tapped on button")

            findViewById<ConstraintLayout>(R.id.backgroundview).setBackgroundColor(getResources().getColor(R.color.lightBlue));
        }

        findViewById<Button>(R.id.button3).setOnClickListener {

            Log.i("Noel", "Tapped on button")
            findViewById<TextView>(R.id.textView).setText("Android is Awesome!")
        }

    }
}



