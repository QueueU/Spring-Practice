package com.simple;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMain {

    public static void main(String args[]) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath*:Application.xml");


        Coach theCoach = context.getBean("tennisCoach", Coach.class);


        System.out.println(theCoach.getDailyWorkout());


        System.out.println(theCoach.getDailyFortune());

        context.close();
    }

}
