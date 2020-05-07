package com.example.startagain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener{
            Log.i("Main Activity","Button clicked")
            Toast.makeText(this, "Button was clicked", Toast.LENGTH_SHORT).show()

        }

    }
}
