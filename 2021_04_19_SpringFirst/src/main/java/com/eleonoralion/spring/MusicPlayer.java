package com.eleonoralion.spring;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;
    private List<Music> allMusic = new ArrayList<>();
    private int volume;

    // IoC
    public MusicPlayer(Music music) {
        System.out.println("new MusicPlayer()");
        this.music = music;
    }

    public MusicPlayer(){
        System.out.println("new MusicPlayer()");
        music = new Music() {
            @Override
            public String getSong() {
                return "- - -";
            }
        };
    }


    public List<Music> getAllMusic() {
        return allMusic;
    }

    public void setAllMusic(List<Music> allMusic) {
        this.allMusic = allMusic;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }


    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }

    public void playAllMusic(){
        System.out.println("Playing all: ");
        for(Music music : allMusic){
            System.out.println(music.getSong() + " ");
        }
    }

    public void init(){
        System.out.println("MusicPlayer init!" + music.getSong());
    }
    public void destroy(){
        System.out.println("MusicPlayer destroy...");
    }
}
