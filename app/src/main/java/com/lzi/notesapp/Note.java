package com.lzi.notesapp;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "note")
public class Note {
    @PrimaryKey(autoGenerate = true)
    private Long id;
    @ColumnInfo(name = "title")
    private String name;
    @ColumnInfo(name = "data_time")
    private String dateTime;
    @ColumnInfo(name = "subtitle")
    private String subtitle;
    @ColumnInfo(name = "noteText")
    private String noteText;
    @ColumnInfo(name = "imagePath")
    private String imagePath;
    @ColumnInfo(name = "color")
    private String color;
    @ColumnInfo(name = "webLink")
    private String webLink;

    public Note() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWebLink() {
        return webLink;
    }

    public void setWebLink(String webLink) {
        this.webLink = webLink;
    }

    @NonNull
    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", noteText='" + noteText + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", color='" + color + '\'' +
                ", webLink='" + webLink + '\'' +
                '}';
    }
}
