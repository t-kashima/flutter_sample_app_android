package com.unuuu.sampleapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.FrameLayout
import io.flutter.app.FlutterActivity
import io.flutter.facade.Flutter

class FlutterSampleActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_flutter_sample)

    val transaction = supportFragmentManager.beginTransaction()
    transaction.replace(R.id.container, Flutter.createFragment(""))
    transaction.commit()
  }
}
