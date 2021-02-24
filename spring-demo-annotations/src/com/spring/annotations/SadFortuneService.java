package com.spring.annotations;

public class SadFortuneService implements FortuneServvice {

	@Override
	public String getFortune() {
		return "Sad day for all";
	}

}
