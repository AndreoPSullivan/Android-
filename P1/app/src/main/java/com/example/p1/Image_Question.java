package com.example.p1;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Random;

public class Image_Question extends AppCompatActivity implements View.OnClickListener {

    ImageView i1, i2, i3, i4;
    TextView text_pregunta, text_score;
    ArrayList<Question> questions_image;
    Random r = new Random();
    private int index_question;
    int score;
    int level;
    private DatabaseQuestions db;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_quesiton);
        Bundle bundle = getIntent().getExtras();
        score = bundle.getInt("Score");
        level = bundle.getInt("Level");
        this.init();
    }

    private void init() {

        i1 = (ImageView) findViewById(R.id.imageView2);
        i2 = (ImageView) findViewById(R.id.imageView3);
        i3 = (ImageView) findViewById(R.id.imageView4);
        i4 = (ImageView) findViewById(R.id.imageView5);
        text_pregunta = (TextView) findViewById(R.id.pregunta2);
        text_score = (TextView) findViewById(R.id.num_score);
        text_score.setText("" + score);
        db = new DatabaseQuestions();

        switch (level) {
            case 1:
                questions_image = db.initEasyModeImages();
                break;
            case 2:
                questions_image = db.initMediumModeImages();
                break;
            case 3:
                questions_image = db.initHardModeImages();
                break;
        }

        index_question = r.nextInt(questions_image.size());
        this.showQuestion();
    }

    private void showQuestion() {


        text_pregunta.setText(questions_image.get(index_question).getQuestion());
        i1.setImageResource(questions_image.get(index_question).getId_image1());
        i2.setImageResource(questions_image.get(index_question).getId_image2());
        i3.setImageResource(questions_image.get(index_question).getId_image3());
        i4.setImageResource(questions_image.get(index_question).getId_image4());

        i1.setOnClickListener(this);
        i2.setOnClickListener(this);
        i3.setOnClickListener(this);
        i4.setOnClickListener(this);
    }

    private void goToNextScreen() {
        Intent i = new Intent(this, Pantalla_final.class);
        i.putExtra("Score", score);
        startActivity(i);
    }

    @Override
    public void onClick(View v) {
        int id_image = v.getId();
        if (this.isAnswerRight(id_image)) {
            Toast.makeText(getApplicationContext(), "Correcto!", Toast.LENGTH_LONG).show();
            score += 3;

        } else {
            Toast.makeText(getApplicationContext(), "Fallaste!", Toast.LENGTH_SHORT).show();
            if (score >= 2)
                score -= 2;
            else if (score >= 1)
                score--;
        }
        goToNextScreen();
    }

    private boolean isAnswerRight(int id_image) {
        int id = 0;
        switch (id_image) {
            case R.id.imageView2:
                id = questions_image.get(index_question).getId_image1();
                break;
            case R.id.imageView3:
                id = questions_image.get(index_question).getId_image2();
                break;
            case R.id.imageView4:
                id = questions_image.get(index_question).getId_image3();
                break;
            case R.id.imageView5:
                id = questions_image.get(index_question).getId_image4();
                break;
        }
        return (id == questions_image.get(index_question).getId_imageCorrect());
    }
    @Override
    public void onBackPressed() {
        moveTaskToBack(false);}
}
