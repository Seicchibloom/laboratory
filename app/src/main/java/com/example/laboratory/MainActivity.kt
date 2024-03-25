package com.example.laboratory

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.laboratory.R

class MainActivity : AppCompatActivity() {

    private var questionNo = 0
    private var questions = listOf(
        "Who Owns a Motorbike \n\n A) Derince and Rob \n\n B) Rob and Charlie \n\n C) Alezander and Charlie",
        "Who studies the most \n\n A) Charlie \n\n B) Rob \n\n C) Alezander",
        "Who is a returnee student \n\n A) Charlie \n\n B) Alezander \n\n C) Rob",
        "Who has many friends in Lasalle? \n\n A) Charlie \n\n B) Derince \n\n C) Rob"
    )
    private var rightAnswers = listOf(1, 1, 2, 1)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)

        button1.setOnClickListener {
            showToast(1)
        }

        button2.setOnClickListener {
            showToast(2)
        }

        button3.setOnClickListener {
            showToast(3)
        }
    }

    private fun showToast(answer: Int) {
        if (answer == rightAnswers[questionNo]) {
            Toast.makeText(applicationContext, "CORRECT!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(applicationContext, "WRONG!", Toast.LENGTH_SHORT).show()
        }
        updateQuestion()
    }

    private fun updateQuestion() {
        if (questionNo < questions.size - 1) {
            questionNo++
            findViewById<TextView>(R.id.textView_a).setText(questions[questionNo])
        } else {
            Toast.makeText(applicationContext, "End of questions", Toast.LENGTH_SHORT).show()
        }
    }
}
