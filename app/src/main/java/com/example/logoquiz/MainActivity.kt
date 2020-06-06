package com.example.logoquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //late initialization of component and are of non-nullable type
    lateinit var btn_start: Button
    lateinit var et_name: AppCompatEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        //assign value to latelinit variables
        et_name = findViewById(R.id.et_name)
        btn_start = findViewById(R.id.btn_start)

        btn_start.setOnClickListener {

            if (et_name.text.toString().isEmpty()) {

                Toast.makeText(this@MainActivity, "Please enter your name", Toast.LENGTH_SHORT).show()
            } else {

                val intent = Intent(this@MainActivity, QuizQuestionsActivity::class.java)  //send data to QuizQuestion Activity
                startActivity(intent)  //start another activity
                finish()
            }
        }
    }
}
