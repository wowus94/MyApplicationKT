package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("myLogs", "${data.toString()}")
    }

    fun hello(view: View) {
        val myToast = Toast.makeText(this, "Hello!", Toast.LENGTH_SHORT)
        myToast.show()
    }
}