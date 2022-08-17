package com.prasath.passingdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun passData(view: View) {
        val user_name=input.editableText.toString()
        val intent= Intent(this,nameActivity::class.java)
        intent.putExtra(nameActivity.PASS,user_name)
        startActivity(intent)
    }
}