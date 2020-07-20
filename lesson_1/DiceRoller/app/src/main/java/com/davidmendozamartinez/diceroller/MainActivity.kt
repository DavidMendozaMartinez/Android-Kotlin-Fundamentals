package com.davidmendozamartinez.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var resultText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultText = findViewById(R.id.result_text)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countUpButton: Button = findViewById(R.id.count_up_button)
        countUpButton.setOnClickListener { countUp() }
    }

    private fun rollDice() {
        val randomInt = (1..6).random()
        resultText.text = randomInt.toString()
    }

    private fun countUp() {
        resultText.text = when (val resultInt = resultText.text.toString().toIntOrNull()) {
            null -> "1"
            in 1..5 -> "${resultInt + 1}"
            else -> "6"
        }
    }
}