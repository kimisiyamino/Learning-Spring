package com.eleonoralion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private Music rockMusic;
    private Music rapMusic;
    @Value("999")
    private int volume;

    @Autowired
    public MusicPlayer(
            @Qualifier("rockMusic")Music rockMusic,
            @Qualifier("rapMusic")Music rapMusic){
        this.rockMusic = rockMusic;
        this.rapMusic = rapMusic;
    }

    public void playMusic(Genres genres){
        switch (genres){
            case RAP: System.out.println(rapMusic.getSong()); break;
            case ROCK: System.out.println(rockMusic.getSong()); break;
        }
    }

    public void getVolume() {
        System.out.println(volume);

    }
}
