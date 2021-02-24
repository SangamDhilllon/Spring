package com.springdemo;

public class BaseballCoach implements Coach{

	//define private field and constructor
	private FortuneService fortune;
	public BaseballCoach(FortuneService fortune) {

		this.fortune=fortune;
	}
	
	@Override
	public String getDailyWorkout() {
		return "BaseballCoach---Spend 30 minutes on batting";
	}

	@Override
	public String getDailyFortune() {
		//use dependency to call method
		return fortune.getFortune();
	}
}
