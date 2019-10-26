package com.example.p1.Interfaces;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;

import androidx.room.Insert;
import androidx.room.Query;

import com.example.p1.Entities.QuestionEntity;
import com.example.p1.Question;

import java.util.List;


@Dao
public interface QuestionDao {

    //Operaciones que se pueden hacer sobre la base de datos
    @Query("SELECT COUNT(*) FROM" + QuestionEntity.TABLE_NAME)
    int count();

    @Query("SELECT * FROM " + QuestionEntity.TABLE_NAME)
    LiveData<List<QuestionEntity>> getAllQuestions();


    @Query("DELETE FROM " + QuestionEntity.TABLE_NAME)
    void deleteAll();

    @Query("SELECT * FROM " +QuestionEntity.TABLE_NAME + " WHERE " +QuestionEntity.COLUMN_ID + " LIKE :idQuestion")
    QuestionEntity loadQuestion(int idQuestion);

    @Insert
    void insert (QuestionEntity question);



}
