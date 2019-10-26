package com.example.p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pantalla_final extends AppCompatActivity {

    TextView scoreText;
    Button buttonSalir;
    Button buttonVolver;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_final);
        Bundle bundle = getIntent().getExtras();
        score = bundle.getInt("Score");
       System.out.println(score);
        this.init();
    }

    private void init(){
        scoreText = (TextView) findViewById(R.id.score);
        buttonSalir = (Button) findViewById(R.id.boton_salir);
        buttonVolver = (Button) findViewById(R.id.boton_volver);
        scoreText.setText(String.valueOf(score));

        buttonVolver.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        goToNextScreen();
                    }
                });

        buttonSalir.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //Salir de la app
                        finishAffinity();
                        System.exit(0);
                    }
                });
    }

    private void goToNextScreen() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(false);}
}
