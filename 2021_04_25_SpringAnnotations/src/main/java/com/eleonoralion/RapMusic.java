package com.eleonoralion;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Component
public class RapMusic implements Music {

    private List<String> playlist;

    public RapMusic() {
        playlist = new ArrayList<String>();
        Collections.addAll(this.playlist, "50CENT", "Snoop Dog", "Eminem");
    }

    @Override
    public String getSong() {
        return playlist.get(new Random().nextInt(3));
    }
}
