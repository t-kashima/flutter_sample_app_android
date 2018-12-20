package com.unuuu.sampleapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import io.flutter.app.FlutterActivity
import io.flutter.facade.Flutter

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    findViewById<Button>(R.id.button).setOnClickListener {
      startActivity(Intent(this, FlutterSampleActivity::class.java))
    }
  }
}
