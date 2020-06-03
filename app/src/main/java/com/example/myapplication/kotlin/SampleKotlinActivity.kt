package com.example.myapplication.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import com.clean.master.app.featuremodule.TestJava
import com.clean.master.app.featuremodule.TestKotlin

class SampleKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        showToast()
    }

    private fun showToast() {
        val kotlinClassTest = TestKotlin()
        val javaClassTest = TestJava()
        Toast.makeText(this, kotlinClassTest.geKotlinMessage() + javaClassTest.javaMessage, Toast.LENGTH_SHORT).show()
    }
}