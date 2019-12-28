package com.example.bootmvc;

import javax.validation.constraints.Null;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Student {


    private String firstName;

    public String getCountry1() {
        return country1;
    }

    public void setCountry1(String country1) {
        this.country1 = country1;
    }

    private String secondName;

    private  String country1;
    public String[] getOS() {
        return OS;
    }


    public void setCountry(LinkedHashMap<String, String> country) {
        this.country = country;
    }



    public void setOS(String[] OS) {
        this.OS = OS;
    }

    private LinkedHashMap<String,String> country;
    private String[] OS;

    private String lang;


    public LinkedHashMap<String, String> getCountry() {
        return country;
    }





    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Student()
    {
        country=new LinkedHashMap<>();
        country.put("IN","INDIA");
        country.put("US","USA");
        country.put("CA","CANADA");
        country.put("AUS","Australia");



    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
