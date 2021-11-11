package com.eleonoralion.spring;

public class RockMusic implements  Music {


    @Override
    public String getSong() {
        return "Ozzy Osbourne";
    }

    public RockMusic(){
        System.out.println("new Rock()");
    }

    public void init(){
        System.out.println("Rock init!");
    }

    public void destroy(){
        System.out.println("Rock destroy...");
    }
}
