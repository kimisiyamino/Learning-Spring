package com.eleonoralion;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class RockMusic implements Music{

    private List<String> playlist;

    public RockMusic() {
        playlist = new ArrayList<String>();
        Collections.addAll(this.playlist, "Ozzy", "Metallica", "ACDC");
    }

    @Override
    public String getSong() {
        return playlist.get(new Random().nextInt(3));
    }
}
