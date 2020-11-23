package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnchengename = findViewById<Button>(R.id.btnchengename)
        val city = findViewById<Button>(R.id.city)

        val inputName = findViewById<EditText>(R.id.inputname)
        val lblname = findViewById<TextView>(R.id.lblname)

        val inputcity = findViewById<EditText>(R.id.inputcity)
        val lblcity= findViewById<TextView>(R.id.lblcity)

        btnchengename.setOnClickListener {

            var name = inputName.text.toString()
            var pilseta = inputcity.text.toString()

            // var prived = name + pilseta
            Toast.makeText(this@MainActivity, "Mani sauc " + name  + " dzivoju " + pilseta, Toast.LENGTH_SHORT).show()

            lblname.text = name
            lblcity.text = pilseta

        }

    }
}