package com.example.splashexample;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // start splash

        Intent intent = new Intent(this, SplashActivity.class);

        startActivity(intent);

        setTheme(R.style.AppTheme);

        setContentView(R.layout.activity_main);



    }
}
