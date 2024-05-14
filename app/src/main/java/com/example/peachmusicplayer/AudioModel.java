package com.example.peachmusicplayer;

import java.io.Serializable;
// Класс AudioModel хранит параметры проигрываемой песни
public class AudioModel implements Serializable {
    String path; // Путь
    String title; // Название песни
    String duration; // Размер песни

    public AudioModel(String path, String title, String duration) {
        this.path = path;
        this.title = title;
        this.duration = duration;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
