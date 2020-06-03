package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.kotlin.SampleKotlinActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(v -> launchActivity());
    }

    private void launchActivity() {
        Intent intent = new Intent(this, SampleKotlinActivity.class);
        startActivity(intent);
    }
}
