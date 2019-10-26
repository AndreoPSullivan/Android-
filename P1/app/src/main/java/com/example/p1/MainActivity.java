package com.example.p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView title;
    Spinner lista;
    Button botonEmpezar, botonConfiguracion, botonClasificacion;
    String[] datos = {"-", "Fácil", "Medio", "Difícil"};
    int dificultad = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = (Spinner) findViewById(R.id.spinner_dificultad);
        botonEmpezar = (Button) findViewById(R.id.empezar);
        botonConfiguracion = (Button) findViewById(R.id.configuracion);
        botonClasificacion = (Button) findViewById(R.id.clasificacion);
        title = (TextView) findViewById(R.id.title);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/waltograph.ttf");
        title.setTypeface(custom_font);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos);
        lista.setAdapter(adaptador);
        lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                dificultad = i;
            }



            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                //do nothing
            }
        });
        botonEmpezar.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        if (dificultad != 0) goToNextScreen();
                    }
                });

        botonConfiguracion.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        goToConfigurationScreen();
                    }
                }
        );
        botonClasificacion.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        goToClasificationScreen();
                    }
                }
        );

    }

    private void goToNextScreen() {
        Intent i = new Intent(this, Quizz.class);
        i.putExtra("Dificultad", dificultad);
        startActivity(i);
    }

    private void goToConfigurationScreen() {
        Intent i = new Intent(this, Configuration.class);
        startActivity(i);
    }

    private void goToClasificationScreen(){
        Intent i = new Intent(this, Clasification.class);
        startActivity(i);
    }

}
