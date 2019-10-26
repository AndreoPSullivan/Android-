package com.example.p1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Clasification extends AppCompatActivity {

    Button buttonVolver2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clasification);
        this.init();
    }

    private void init(){
        buttonVolver2 = (Button) findViewById(R.id.buttonVolver);

        buttonVolver2.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        goToMainActivity();
                    }
                });


    }

    private void goToMainActivity() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }



}
