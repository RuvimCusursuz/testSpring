package com.ruvimcusursuz;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

//        Music music = context.getBean("musicBean", Music.class);

        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer1.playMusic();


        System.out.println(musicPlayer1==musicPlayer2);
        System.out.println(musicPlayer1);
        System.out.println(musicPlayer2);

        musicPlayer1.setVolume(90);

        System.out.println(musicPlayer1.getVolume());
        System.out.println(musicPlayer2.getVolume());
//        System.out.println(musicPlayer1.getName());
//        System.out.println(musicPlayer1.getVolume());
        context.close();
    }
}
