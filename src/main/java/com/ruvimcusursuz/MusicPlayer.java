package com.ruvimcusursuz;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> music = new ArrayList<>();
    private String name;
    private int volume;

    public MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer(){};

    public void setMusic(List<Music> music) {
        this.music = music;
    }

    public void playMusic() {
        music.forEach(e -> {
            System.out.println(e.getSong());
        });
    }

}
