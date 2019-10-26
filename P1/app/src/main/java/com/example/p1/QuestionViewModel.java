package com.example.p1;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.p1.Entities.QuestionEntity;

import java.util.List;

public class QuestionViewModel extends AndroidViewModel {
    private QuestionRespository mRepository;
    private LiveData<List<QuestionEntity>> mAllQuestions;

    public QuestionViewModel (Application application){
        super(application);
        mRepository = new QuestionRespository(application);
        mAllQuestions = mRepository.getAllQuestions();
    }

    LiveData<List<QuestionEntity>> getAllQuestions(){return mAllQuestions;}

    public void insert(QuestionEntity question) {mRepository.insert(question);}

    public void loadQuestion(int idQuestion){
        mRepository.loadQuestion(idQuestion);
    }
}
