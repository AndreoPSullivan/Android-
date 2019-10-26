package com.example.p1;

import android.os.AsyncTask;

import com.example.p1.Entities.QuestionEntity;
import com.example.p1.Interfaces.QuestionDao;


class insertAsyncTask extends AsyncTask<QuestionEntity, Void, Void> {

        private QuestionDao mAsyncTaskDao;

        insertAsyncTask(QuestionDao dao) {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final QuestionEntity... params) {
            mAsyncTaskDao.insert(params[0]);

            return null;
        }


    }

