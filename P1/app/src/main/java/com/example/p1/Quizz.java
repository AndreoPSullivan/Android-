package com.example.p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class Quizz extends AppCompatActivity {

    private ImageView image;
    private TextView question_text;
    private TextView num_question;
    private TextView score_text;
    private RadioGroup radioGroup;
    private RadioButton radioButtonSelected;
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private RadioButton radioButton4;
    private Button button_validar;
    private Button button_volver;
    private Button button_seguir;
    Random question;
    private final int totalQuestions = 4;
    private int indexQuestion;
    private int score = 0;
    Random r = new Random();
    DatabaseQuestions db;
    private int n_question;
    boolean respondida = false;
    private ArrayList<Question> questionsToShow;

    private int level;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz);
        Bundle bundle = getIntent().getExtras();
        level = bundle.getInt("Dificultad");
        this.init();
    }

    private void init() {

        image = (ImageView) findViewById(R.id.imageView);
        question_text = (TextView) findViewById(R.id.question);
        num_question = (TextView) findViewById(R.id.numero);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioButton1 = (RadioButton) findViewById(R.id.option1);
        radioButton2 = (RadioButton) findViewById(R.id.option2);
        radioButton3 = (RadioButton) findViewById(R.id.option3);
        radioButton4 = (RadioButton) findViewById(R.id.option4);
        button_validar = (Button) findViewById(R.id.empezar);
        button_volver = (Button) findViewById(R.id.Volver);
        button_seguir = (Button) findViewById(R.id.Seguir);
        score_text = (TextView) findViewById(R.id.num_score);
        indexQuestion = 0;
        score = 0;

        db = new DatabaseQuestions();

        switch (level) {
            case 1:
                questionsToShow = db.initEasyMode();
                break;
            case 2:
                questionsToShow = db.initMediumMode();
                break;
            case 3:
                questionsToShow = db.initHardMode();
                break;
        }


        //Para mostrar una pregunta aleatoria
        do {
            n_question = r.nextInt(questionsToShow.size());
        }
        while (questionsToShow.get(n_question).isRated());
        this.showQuestion(n_question);

        System.out.println("" + n_question);

        button_validar.setOnClickListener(

                new View.OnClickListener() {
                    /*Me gustaría añadir que esto sólo lo haga si hay alguno pulsado --> DONE !*/

                    @Override
                    public void onClick(View v) {
                        if (radioGroup.getCheckedRadioButtonId() != -1) {

                            for (int i = 0; i < radioGroup.getChildCount(); i++) {
                                ((RadioButton) radioGroup.getChildAt(i)).setEnabled(false);
                            }

                            if (this.isAnswerRight()) {
                                Toast.makeText(getApplicationContext(), "¡Correcto!", Toast.LENGTH_LONG).show();
                                score += 3;

                            } else {
                                Toast.makeText(getApplicationContext(), "¡Fallaste!", Toast.LENGTH_SHORT).show();
                                if (score >= 2)
                                    score -= 2;
                                else if (score >= 1)
                                    score--;
                            }
                            respondida = true;
                            score_text.setText("" + score);
                            button_validar.setVisibility(View.INVISIBLE);
                            button_seguir.setVisibility(View.VISIBLE);
                            button_volver.setVisibility(View.VISIBLE);
                            //nextQuestion();
                        } else {
                            Toast.makeText(getApplicationContext(), "¡Elige una respuesta!", Toast.LENGTH_SHORT).show();

                        }
                    }

                    private boolean isAnswerRight() {
                        String answer = "";
                        int id = radioGroup.getCheckedRadioButtonId();
                        radioButtonSelected = (RadioButton) findViewById(id);
                        if (radioButtonSelected == radioButton1)
                            answer = questionsToShow.get(n_question).getChoice1();
                        if (radioButtonSelected == radioButton2)
                            answer = questionsToShow.get(n_question).getChoice2();
                        if (radioButtonSelected == radioButton3)
                            answer = questionsToShow.get(n_question).getChoice3();
                        if (radioButtonSelected == radioButton4)
                            answer = questionsToShow.get(n_question).getChoice4();

                        return questionsToShow.get(n_question).isCorrect(answer);
                    }
                }
        );
        button_volver.setOnClickListener(
                new View.OnClickListener() {
                    /*Me gustaría añadir que esto sólo lo haga si hay alguno pulsado --> DONE !*/

                    @Override
                    public void onClick(View v) {
                        if (respondida) goToMain();
                    }
                });
        button_seguir.setOnClickListener(
                new View.OnClickListener() {
                    /*Me gustaría añadir que esto sólo lo haga si hay alguno pulsado --> DONE !*/
                    @Override
                    public void onClick(View v) {
                        if (respondida) nextQuestion();

                    }
                });

    }

    private void goToMain() {
        respondida = false;
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    /*
     * Si la pregunta aún no se ha mostrado, se muestra, de haberlo hecho se modifica el índice de la pregunta a mostrar y se muestra
     *
     * */
    private void showQuestion(int index) {


        image.setImageResource(questionsToShow.get(index).getId_image());
        num_question.setText(" " + (indexQuestion + 1));
        question_text.setText(questionsToShow.get(index).getQuestion());
        radioButton1.setText(questionsToShow.get(index).getChoice1());
        radioButton2.setText(questionsToShow.get(index).getChoice2());
        radioButton3.setText(questionsToShow.get(index).getChoice3());
        radioButton4.setText(questionsToShow.get(index).getChoice4());
        radioGroup.clearCheck(); // para que en la siguiente pregunta no siga seleccionado uno
        questionsToShow.get(index).setRated(true);

    }

    private void nextQuestion() {
        indexQuestion = (indexQuestion + 1);
        for (int i = 0; i < radioGroup.getChildCount(); i++) {
            ((RadioButton) radioGroup.getChildAt(i)).setEnabled(true);
        }
        if (indexQuestion < totalQuestions) {
            button_validar.setVisibility(View.VISIBLE);
            button_seguir.setVisibility(View.INVISIBLE);
            button_volver.setVisibility(View.INVISIBLE);
            respondida = false;
            //aun quedan preguntas -> mostrar siguiente
            do {
                n_question = r.nextInt(questionsToShow.size());
            }
            while (questionsToShow.get(n_question).isRated());
            this.showQuestion(n_question);
        } else {
            // ya ha terminado
            goToNextScreen();
        }

    }

    private void goToNextScreen() {

        Intent i = new Intent(this, Image_Question.class);
        i.putExtra("Score", score);
        i.putExtra("Level", level);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(false);
    }
}
