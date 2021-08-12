package com.lzi.notesapp.database;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.lzi.notesapp.dao.NoteDao;
import com.lzi.notesapp.models.Note;

@Database(entities = Note.class, version = 1, exportSchema = false)
abstract class NotesDatabase extends RoomDatabase {
    private static NotesDatabase noteDatabase;

    public static synchronized NotesDatabase getInstance(Context context){
        if (noteDatabase == null){
            noteDatabase = Room.databaseBuilder(context, NotesDatabase.class, "notes_db")
                    .build();
        }
        return noteDatabase;
    }

    public abstract NoteDao noteDao();
}
