package com.example.attributes

import android.app.Activity
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.EditText

class MainActivity : Activity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val sampleInput: EditText = findViewById(R.id.edit_text_sample)
    val blackTextButton: Button = findViewById(R.id.button_black_text)
    val redTextButton: Button = findViewById(R.id.button_red_text)
    val smallTextButton: Button = findViewById(R.id.button_small_text)
    val largeTextButton: Button = findViewById(R.id.button_large_text)
    val whiteBackgroundButton: Button = findViewById(R.id.button_white_background)
    val yellowBackgroundButton: Button = findViewById(R.id.button_yellow_background)
    val smallTextSize: Float = resources.getInteger(R.integer.small_text_size).toFloat()
    val largeTextSize: Float = resources.getInteger(R.integer.large_text_size).toFloat()

    blackTextButton.setOnClickListener {
      sampleInput.setTextColor(getColor(R.color.black))
    }

    redTextButton.setOnClickListener {
      sampleInput.setTextColor(getColor(R.color.red))
    }

    smallTextButton.setOnClickListener {
      sampleInput.setTextSize(TypedValue.COMPLEX_UNIT_SP, smallTextSize)
    }

    largeTextButton.setOnClickListener {
      sampleInput.setTextSize(TypedValue.COMPLEX_UNIT_SP, largeTextSize)
    }

    whiteBackgroundButton.setOnClickListener {
      sampleInput.setBackgroundColor(getColor(R.color.white))
    }

    yellowBackgroundButton.setOnClickListener {
      sampleInput.setBackgroundColor(getColor(R.color.yellow))
    }
  }
}
