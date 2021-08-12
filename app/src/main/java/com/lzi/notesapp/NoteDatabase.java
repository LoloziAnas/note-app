package com.lzi.notesapp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;

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
