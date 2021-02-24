package com.spring.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneServvice fortune;
	
//	@Autowired
//	public TennisCoach(@Qualifier("happyFortuneService") FortuneServvice fortune) {
//		this.fortune=fortune;
//	}

//	@Autowired
//	public void createFortune(FortuneServvice fortune) {
//		this.fortune = fortune;
//	}
//	
	
	
	//define init method
	@PostConstruct
	public void start() {
		System.out.println("Inside start method");
	}
	
	//define destroy method
	@PreDestroy
	public void stop() {
		System.out.println("Inside destroy method");
	}
	
	@Override
	public String getDailyWorkout() {
		return "TennisCoach-Practice backhand";
	}

	

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}

}
