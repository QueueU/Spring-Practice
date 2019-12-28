package com.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements  Coach{


    @Autowired
    private HappyFortune happyFortune;



    TennisCoach(HappyFortune happyFortune)
    {
        System.out.println("Inside Contructor");
    }


    /*
    @Autowired
    public void setHappyFortune(HappyFortune happyFortune)
    {
        System.out.println("Inside Set Happy Fortune");
        this.happyFortune=happyFortune;
    }


     */


  /*
    @Autowired
    public void doHappyFortune(HappyFortune happyFortune)
    {

        System.out.println("Inside Method injection");
        this.happyFortune=happyFortune;
    }

   */

    @Override
    public String getDailyWorkout() {

        System.out.println("Know");
        return "Hellow From TennisCoach";

    }

    @Override
    public String getDailyFortune() {
        return happyFortune.getDailyFortune();
    }


}
