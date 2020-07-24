package com.davidmendozamartinez.colormyviews

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners() {
        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val boxSixText = findViewById<TextView>(R.id.box_six_text)
        val boxSevenText = findViewById<TextView>(R.id.box_seven_text)
        val boxEightText = findViewById<TextView>(R.id.box_eight_text)
        val boxNineText = findViewById<TextView>(R.id.box_nine_text)
        val boxTenText = findViewById<TextView>(R.id.box_ten_text)
        val boxElevenText = findViewById<TextView>(R.id.box_eleven_text)
        val boxTwelveText = findViewById<TextView>(R.id.box_twelve_text)
        val boxThirteenText = findViewById<TextView>(R.id.box_thirteen_text)
        val boxFourteenText = findViewById<TextView>(R.id.box_fourteen_text)
        val boxFifteenText = findViewById<TextView>(R.id.box_fifteen_text)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val clickableViews: List<View> = listOf(
            boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText, boxSixText,
            boxSevenText, boxEightText, boxNineText, boxTenText, boxElevenText, boxTwelveText,
            boxThirteenText, boxFourteenText, boxFifteenText, rootConstraintLayout
        )

        val palette = resources.getIntArray(R.array.mondrian_color_palette)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it, palette) }
        }
    }

    private fun makeColored(view: View, palette: IntArray) {
        val color = palette.random()
        view.setBackgroundColor(color)
    }
}