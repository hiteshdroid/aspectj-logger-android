package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        launchActivity();

        SampleKotlinActivity sampleKotlinActivity = new SampleKotlinActivity();
        sampleKotlinActivity.callFromOutside();
    }

    private void launchActivity() {
        //Intent intent = new Intent(this, SampleKotlinActivity.class);
        //startActivity(intent);
    }
}
