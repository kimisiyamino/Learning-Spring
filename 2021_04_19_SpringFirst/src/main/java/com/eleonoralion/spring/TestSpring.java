package com.eleonoralion.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext contex = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        Music music = contex.getBean("musicBean", Music.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//
//        System.out.println(music.getSong());
//
//        musicPlayer.playMusic();
//
//        //
//        contex.close();


//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//    MusicPlayer musicPlayer = context.getBean("musicPlayer4", MusicPlayer.class);
//        musicPlayer.playAllMusic();
//        System.out.println("volume: " + musicPlayer.getVolume());
//        context.close();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        RockMusic rockMusic = context.getBean("musicBeanRock", RockMusic.class);
       // RockMusic rockMusic2 = context.getBean("musicBeanRock", RockMusic.class);
        context.close();
}
}
