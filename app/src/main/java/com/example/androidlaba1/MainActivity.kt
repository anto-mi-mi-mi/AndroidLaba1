package com.example.androidlaba1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputEditor = findViewById(R.id.inputEditor) as TextView
        val textView = findViewById(R.id.textView) as TextView

        val updateButton = findViewById(R.id.updateButton) as Button
        val mainButton = findViewById(R.id.mainButton) as Button


        mainButton.setOnClickListener {
            textView.setText(Strings().inputData)
        }
        updateButton.setOnClickListener {
            val str = "\n" + Strings().result
            inputEditor.setText(str)
        }
    }




}