package com.example.demo;

public class BaseballCoach implements Coach{

	
	
	private FortuneServices fortuneServices;
	
	
	
	public BaseballCoach(FortuneServices fortuneServices)
	{
		this.fortuneServices=fortuneServices;
	}
	@Override
	public String getDailyWorkout() {
		return "hellow from getDailtyWorkout from baseballCoach class";
	}

	@Override
	public String getDailyFortune() {
		
		return null;
	}

	
	
}
