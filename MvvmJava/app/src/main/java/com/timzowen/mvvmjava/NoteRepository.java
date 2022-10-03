package com.timzowen.mvvmjava;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

public class NoteRepository {

    private NoteDAO noteDAO;
    private LiveData<List<Note>> notesList;

    public NoteRepository(Application application){
        NoteDatabase noteDatabase = NoteDatabase.getInstance(application);
        noteDAO = noteDatabase.noteDAO();
        notesList = noteDAO.getAllNotes();
    }

    public void insertData(){
        new InsertAsyncTask(noteDAO).execute();
    }

    public void updateData(){
        new UpdateAsyncTask(noteDAO).execute();
    }

    public void deleteData(){
        new DeleteAsyncTask(noteDAO).execute();
    }

    public void deleteAllData(){
        new DeleteAllAsyncTask(noteDAO).execute();
    }

    public LiveData<List<Note>> getAllData(){
    return notesList;
    }

    private static class InsertAsyncTask extends AsyncTask<Note, Void, Void> {

        private NoteDAO noteDAO;

        public InsertAsyncTask(NoteDAO noteDAO){
            this.noteDAO = noteDAO;
        }
        @Override
        protected Void doInBackground(Note... notes) {
            noteDAO.insert(notes[0]);
            return null;
        }
    }

    private static class DeleteAsyncTask extends AsyncTask<Note, Void, Void> {

        private NoteDAO noteDAO;

        public DeleteAsyncTask(NoteDAO noteDAO){
            this.noteDAO = noteDAO;
        }
        @Override
        protected Void doInBackground(Note... notes) {
            noteDAO.delete(notes[0]);
            return null;
        }
    }

    private static class UpdateAsyncTask extends AsyncTask<Note, Void, Void> {

        private NoteDAO noteDAO;

        public UpdateAsyncTask(NoteDAO noteDAO){
            this.noteDAO = noteDAO;
        }
        @Override
        protected Void doInBackground(Note... notes) {
            noteDAO.update(notes[0]);
            return null;
        }
    }

    private static class DeleteAllAsyncTask extends AsyncTask<Void, Void, Void> {

        private NoteDAO noteDAO;

        public DeleteAllAsyncTask(NoteDAO noteDAO){
            this.noteDAO = noteDAO;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            noteDAO.deleteAll();
            return null;
        }
    }
}
