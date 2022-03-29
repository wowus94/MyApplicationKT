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

        val data = Data ("Vladimir",27)
        val data2 = data.copy()
        data2.name = "Toly"
        data2.age = 30

        Log.d("myLogs", "Data age: $data")
        Log.d("myLogs", "Data age: $data2")
    }

    fun hello(view: View) {
        val myToast = Toast.makeText(this, "Hello!", Toast.LENGTH_SHORT)
        myToast.show()
    }
}