package com.example.p1.Entities;

import android.provider.BaseColumns;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = QuestionEntity.TABLE_NAME)
public class QuestionEntity {



    public static final String TABLE_NAME = "QuestionsTable";
    public static final String COLUMN_NAME = "Question";
    public static final String COLUMN_ID = BaseColumns._ID;
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(index = true, name = COLUMN_ID)
    public int id;

    @ColumnInfo(name = "pregunta")
    private String pregunta;
    @ColumnInfo(name = "respuesta1")
    private String respuesta1;
    @ColumnInfo(name = "respuesta2")
    private String respuesta2;
    @ColumnInfo(name = "respuesta3")
    private String respuesta3;
    @ColumnInfo(name = "respuesta4")
    private String respuesta4;
    @ColumnInfo(name = "respuestacorrecta")
    private String respuestacorrecta;


    public QuestionEntity(int id, String pregunta, String respuesta1, String respuesta2, String respuesta3, String respuesta4, String respuestacorrecta) {
        this.id = id;
        this.pregunta = pregunta;
        this.respuesta1 = respuesta1;
        this.respuesta2 = respuesta2;
        this.respuesta3 = respuesta3;
        this.respuesta4 = respuesta4;
        this.respuestacorrecta = respuestacorrecta;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta1() {
        return respuesta1;
    }

    public void setRespuesta1(String respuesta1) {
        this.respuesta1 = respuesta1;
    }

    public String getRespuesta2() {
        return respuesta2;
    }

    public void setRespuesta2(String respuesta2) {
        this.respuesta2 = respuesta2;
    }

    public String getRespuesta3() {
        return respuesta3;
    }

    public void setRespuesta3(String respuesta3) {
        this.respuesta3 = respuesta3;
    }

    public String getRespuesta4() {
        return respuesta4;
    }

    public void setRespuesta4(String respuesta4) {
        this.respuesta4 = respuesta4;
    }

    public String getRespuestacorrecta() {
        return respuestacorrecta;
    }

    public void setRespuestacorrecta(String respuestacorrecta) {
        this.respuestacorrecta = respuestacorrecta;
    }


}
