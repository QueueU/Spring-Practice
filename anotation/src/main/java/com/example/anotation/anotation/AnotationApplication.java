package com.example.anotation.anotation;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AnotationApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");


 Couch ch=context.getBean("tennisCoach",Couch.class);

 System.out.println("Text Is "+ch.getDailyWorkOut());




    }

}
