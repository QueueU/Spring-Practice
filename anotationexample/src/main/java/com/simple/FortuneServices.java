package com.simple;


import org.springframework.stereotype.Component;

@Component
public class FortuneServices implements HappyFortune {


    @Override
    public String getDailyFortune() {
        return "Hellow I am From getDailyFortuneServices";
    }
}
