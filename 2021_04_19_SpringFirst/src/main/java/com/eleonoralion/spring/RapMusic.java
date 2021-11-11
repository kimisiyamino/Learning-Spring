package com.eleonoralion.spring;

public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "Snoop Dog";
    }

    public RapMusic(){
        System.out.println("new Rap()");
    }

    public void init(){
        System.out.println("Rap init!");
    }

    public void destroy(){
        System.out.println("Rap destroy...");
    }
}
