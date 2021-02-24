package com.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortune;
	
	//addd private fields
	private String email;
	private String team;
	
	public CricketCoach() {

		System.out.println("CricketCoach--Inside no arg constructor");
	}

	//setter for injecting dependency
	public void setFortune(FortuneService fortune) {
		this.fortune = fortune;
	}
	
	//setters for injecting literals

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}

}
