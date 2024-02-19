package com.ruvimcusursuz;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Music music = context.getBean("classicaMusic", ClassicaMusic.class);
        Music music1 = context.getBean("rockMusic", RockMusic.class);

        MusicPlayer musicPlayer= new MusicPlayer(music);
        MusicPlayer musicPlayer1= new MusicPlayer(music1);

        musicPlayer.playMusic();
        musicPlayer1.playMusic();

        context.close();
     }
}
