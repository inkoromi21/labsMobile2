package com.example.logging

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import timber.log.Timber

class MainActivity : Activity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val messageInput: EditText = findViewById(R.id.edit_text_message)
    val logButton: Button = findViewById(R.id.button_log)
    val timberButton: Button = findViewById(R.id.button_timber)
    val logTag: String = getString(R.string.log_tag)

    // Keep one tree when the activity is recreated.
    if (Timber.treeCount == 0) {
      Timber.plant(Timber.DebugTree())
    }

    logButton.setOnClickListener {
      val message: String = messageInput.text.toString()

      Log.v(logTag, message)
    }

    timberButton.setOnClickListener {
      val message: String = messageInput.text.toString()

      // A format argument preserves percent signs in the entered text.
      Timber.v("%s", message)
    }
  }
}
