package com.example.p1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Configuration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration);
        Bundle bundle = getIntent().getExtras();

        //this.init();
    }
}
