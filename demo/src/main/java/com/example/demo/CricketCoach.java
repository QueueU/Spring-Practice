package com.example.demo;

public class CricketCoach implements Coach {
	
	CricketCoach(){
		System.out.println("Hellow from cricketcoach class contructor");
	}
	
	
	private FortuneServices fortuneServices;
	
	public void setFortuneServices(FortuneServices fortuneServices)
	{
		this.fortuneServices=fortuneServices;
	}
	
	public String getDailyWorkout()
	{
		return "Hellow Form Cricket coach ";
		
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneServices.getFortune();
	}
	
	
 
}
