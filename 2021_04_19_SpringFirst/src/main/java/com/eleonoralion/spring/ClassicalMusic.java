package com.eleonoralion.spring;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Moon Sonate";
    }

    public ClassicalMusic(){
        System.out.println("new Classical()");
    }

    public void init(){
        System.out.println("Classical init!");
    }

    public void destroy(){
        System.out.println("Classical destroy...");
    }
}
