package com.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneServvice {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
