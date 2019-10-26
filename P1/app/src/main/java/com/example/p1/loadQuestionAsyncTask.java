package com.example.p1;

import android.os.AsyncTask;

import com.example.p1.Entities.QuestionEntity;
import com.example.p1.Interfaces.QuestionDao;

class loadQuestionAsyncTask extends AsyncTask<Integer, Void, QuestionEntity> {

    private QuestionDao mAsyncTaskDao;

    loadQuestionAsyncTask(QuestionDao dao) {
        mAsyncTaskDao = dao;
    }

    @Override
    protected QuestionEntity doInBackground(final Integer... params) {
        QuestionEntity q =  mAsyncTaskDao.loadQuestion(params[0]);
        System.out.println("Fin");
        return q;
    }

    @Override
    protected void onPostExecute(QuestionEntity q){
        Quizz.q = q;
        System.out.println("Tengo la pregunta" + Quizz.q);
    }
}
