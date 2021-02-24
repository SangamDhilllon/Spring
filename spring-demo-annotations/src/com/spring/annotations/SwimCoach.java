package com.spring.annotations;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneServvice fortune;
	
	@Value("${email}")
	private String email;
	
	@Value("${team}")
	private String team;

	public SwimCoach(FortuneServvice fortune) {

		this.fortune = fortune;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	

}
