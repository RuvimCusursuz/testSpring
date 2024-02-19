package com.ruvimcusursuz;

import org.springframework.stereotype.Component;

@Component
public class CristianSong implements Music{
    @Override
    public String getSong() {
        return "God is good";
    }
}
