package com.example.toasthandler

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : Activity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val button: Button = findViewById(R.id.button_ok)

    button.setOnClickListener {
      Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show()
    }
  }
}
