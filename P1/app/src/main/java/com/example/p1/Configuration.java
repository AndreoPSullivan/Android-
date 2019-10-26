package com.example.p1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Configuration extends AppCompatActivity {

    Spinner numPreguntasSpinner;
    String[] datos = {"-", "5", "10", "15"};
    int numPreguntas;
    Button buttonGuardar, buttonVolver;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration);
        this.init();
    }

    private void init(){

        numPreguntasSpinner= (Spinner) findViewById(R.id.spinner_preguntas);
        buttonGuardar = (Button) findViewById(R.id.buttonGuardar);
        buttonVolver = (Button) findViewById(R.id.buttonVolver);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos);
        numPreguntasSpinner.setAdapter(adapter2);
        numPreguntasSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                numPreguntas = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                //do nothing
            }
        });

        buttonGuardar.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        //Guardar en la base de datos que pongamos
                    }
                });
        buttonVolver.setOnClickListener(
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
