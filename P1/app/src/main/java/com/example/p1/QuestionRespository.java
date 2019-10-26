package com.example.p1;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.p1.Database.AppDatabase;
import com.example.p1.Entities.QuestionEntity;
import com.example.p1.Interfaces.QuestionDao;

import java.util.List;

public class QuestionRespository {
    private QuestionDao mQuestionDao;
    private LiveData<List<QuestionEntity>> mAllQuestions;

    QuestionRespository(Application application) {
        AppDatabase db = AppDatabase.getDatabase(application);
        mQuestionDao = db.questionDao();
        mAllQuestions = mQuestionDao.getAllQuestions();

    }

    LiveData<List<QuestionEntity>> getAllQuestions() {
        return mAllQuestions;
    }

    public void insert(QuestionEntity question) {
        new insertAsyncTask(mQuestionDao).execute(question);
    }

    public void loadQuestion(int idquestion){
        new loadQuestionAsyncTask(mQuestionDao).execute(idquestion);
    }


}
