package com.ruvimcusursuz;

import org.springframework.stereotype.Component;

@Component
public class ClassicaMusic implements Music {

//    private ClassicaMusic(){
//        System.out.println("ClassicalMusic is created");
//    }
//    public static ClassicaMusic factoryMethod(){
//        return new ClassicaMusic();
//    }

//    public void doMyInit(){
//        System.out.println("Bean is created, initialization");
//    }
//    public void doMyDestroy(){
//        System.out.println("Bean is destroyed");
//    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
