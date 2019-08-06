package com.example.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class SampleKotlinActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sampleMethod();
    }

    fun sampleMethod() {
        Log.d("Test", "test");
        callFromOutside()
    }

    fun callFromOutside() {
        Log.d("Test", "test");
    }
}