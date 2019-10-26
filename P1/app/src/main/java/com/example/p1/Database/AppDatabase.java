package com.example.p1.Database;


import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.p1.Config.Constants;
import com.example.p1.Entities.QuestionEntity;
import com.example.p1.Interfaces.QuestionDao;
import com.example.p1.MainActivity;
import com.example.p1.Question;

//Al añadir usuarios, habría que añadir la nueva entidad
@Database(entities = {QuestionEntity.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    //Indicar qué permisos va a tener
    public abstract QuestionDao questionDao();


    //Para poder llamar al manejador de la bd
    private static volatile AppDatabase sInstance;


    public static AppDatabase getDatabase (final Context context){


        if(sInstance == null){
            synchronized (AppDatabase.class){
                if(sInstance == null){
                    sInstance = Room.databaseBuilder(context.getApplicationContext(),
                    AppDatabase.class, Constants.BD_NAME)
                    .addCallback(sRoomDatabaseCallback)
                    .build();
                }
            }
        }
        return sInstance;
    }

    private static RoomDatabase.Callback sRoomDatabaseCallback =
            new RoomDatabase.Callback() {

                @Override
                public void onOpen(@NonNull SupportSQLiteDatabase db) {
                    super.onOpen(db);
                    new PopulateDbAsync(sInstance).execute();
                }
            };

    private static class PopulateDbAsync extends AsyncTask<Void, Void, Void> {

        private final QuestionDao mDao;

        PopulateDbAsync(AppDatabase db) {
            mDao = db.questionDao();
        }

        @Override
        protected Void doInBackground(final Void... params) {

            if(mDao.count() < MainActivity.NUM_TOTAL_PREGUNTAS) {
                mDao.deleteAll();

                QuestionEntity question = new QuestionEntity(0,"¿Dónde se desarrolla \" La Bella y La Bestia\"?",
                        "Reino Unido", "Francia", "Japón", "Alemania", "Francia");
                mDao.insert(question);
                question = new QuestionEntity(1,"¿De qué está hecho Forky en  \"Toy Story 4\"?" ,
                        "De una cucharilla", "De un tenedor de plástico", "De pajitas", "De papel", "De un tenedor de plástico");
                mDao.insert(question);
                question = new QuestionEntity(2, "¿Cómo se llama la mascota dragón de Mulán?",
                        "Drako", "Koi", "Meshi", "Mushu", "Mushu");
                mDao.insert(question);
                question = new QuestionEntity(3,"¿Cuántos sentidos protagonizan la película \"Del Revés\"?",
                        "3", "6", "4", "5", "5" );
                mDao.insert(question);
                question = new QuestionEntity(4,"¿Cómo se llama el malo de \" El Rey León\"?",
                        "Simba", "Scar", "Nala", "Mufasa", "Scar" );
                mDao.insert(question);
                question = new QuestionEntity(5,"¿Cuál de estas actrices hizo de Maléfica en \"Maléfica\"?" ,
                        "Angelina Jolie", "Miley Cyrus", "Lindsay Lohan", "Emma Watson", "Angelina Jolie" );
                mDao.insert(question);
                question = new QuestionEntity(6,"¿Cómo llama Boo a Sully en \"Monstruos S.A.\"?",
                        "Azulito", "Sully", "Gatito", "Peludo", "Gatito");
                mDao.insert(question);
                question = new QuestionEntity(7,"¿De qué color es Baymax en \"Big Hero Six\"?" ,
                        "Blanco", "Azul", "Negro", "Rosa", "Blanco");
                mDao.insert(question);
                question = new QuestionEntity(8,"¿Sobre qué vuelan Aladdin y Jazmín en \"Aladdin\"?",
                        "Un caballo", "Una silla", "Una alfombra", "Un mantel", "Una alfombra");
                mDao.insert(question);
                question = new QuestionEntity(9,"¿Qué nombre aparece escrito bajo la bota de Woody en \"Toy Story\"?",
                        "Woody", "Andy", "Jamie", "Buzz", "Andy");
                mDao.insert(question);
                question = new QuestionEntity(10,"¿Qué animal acompaña a Pocahontas?",
                        "Un mapache", "Un león", "Una mariposa", "Un perro", "Un mapache");
                mDao.insert(question);
                question = new QuestionEntity(11,"¿A qué película se correponde este fotograma?",
                        "La Bella Durmiente", "Cenicienta", "La Bella y La Bestia", "Fantasía", "Cenicienta");
                mDao.insert(question);
                question = new QuestionEntity(12,"¿De qué color tiene el pelo Mérida, la protagonista de la película \"Indomable\"?",
                        "Pelirrojo", "Castaño", "Rubio", "Moreno", "Pelirrojo");
                mDao.insert(question);
                question = new QuestionEntity(13,"¿Qué instrumento toca Miguel, el protagonista de \"Coco\"?",
                        "El tambor", "La flauta", "La guitarra", "El piano", "La guitarra");
                mDao.insert(question);

                //Falta por meter las otras dificultades

            }
            return null;
        }
    }

}
