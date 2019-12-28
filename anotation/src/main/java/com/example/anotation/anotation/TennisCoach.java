package com.example.anotation.anotation;


import org.springframework.stereotype.Component;

@Component
public class TennisCoach  implements Couch{


    public String getDailyWorkOut()
    {
        return "Do daily 5 minitue Push Up";
    }


}
