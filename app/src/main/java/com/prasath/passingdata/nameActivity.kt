package com.prasath.passingdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_name.*

class nameActivity : AppCompatActivity() {
    companion object{
        val PASS="PASS"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)
        val name=intent.getStringExtra(PASS)
        textView.text="welcome $name"
    }
}