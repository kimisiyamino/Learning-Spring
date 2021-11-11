package com.eleonoralion;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext contex = new AnnotationConfigApplicationContext(SpringConfig.class);

        Music rock = contex.getBean("rockMusic", RockMusic.class);
        System.out.println(rock.getSong());
    }
}
