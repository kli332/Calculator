package com.cs407.calculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val addition = findViewById<Button>(R.id.addition)
        val subtraction = findViewById<Button>(R.id.subtraction)
        val multiplication = findViewById<Button>(R.id.multiplication)
        val division = findViewById<Button>(R.id.division)

        addition.setOnClickListener {
            val userInput1 = editText1.text.toString()
            val userInput2 = editText2.text.toString()

            val result = Integer.parseInt(userInput1) + Integer.parseInt(userInput2)

            val intent = Intent(this, CalculatorActivity::class.java)
            intent.putExtra("EXTRA_MESSAGE", result.toString())
            startActivity(intent)
        }

        subtraction.setOnClickListener {
            val userInput1 = editText1.text.toString()
            val userInput2 = editText2.text.toString()

            val result = Integer.parseInt(userInput1) - Integer.parseInt(userInput2)

            val intent = Intent(this, CalculatorActivity::class.java)
            intent.putExtra("EXTRA_MESSAGE", result.toString())
            startActivity(intent)
        }

        multiplication.setOnClickListener {
            val userInput1 = editText1.text.toString()
            val userInput2 = editText2.text.toString()

            val result = Integer.parseInt(userInput1) * Integer.parseInt(userInput2)

            val intent = Intent(this, CalculatorActivity::class.java)
            intent.putExtra("EXTRA_MESSAGE", result.toString())
            startActivity(intent)
        }

        division.setOnClickListener {
            val userInput1 = editText1.text.toString()
            val userInput2 = editText2.text.toString()

            val result = Integer.parseInt(userInput1) / Integer.parseInt(userInput2)

            val intent = Intent(this, CalculatorActivity::class.java)
            intent.putExtra("EXTRA_MESSAGE", result.toString())
            startActivity(intent)
        }
    }
}