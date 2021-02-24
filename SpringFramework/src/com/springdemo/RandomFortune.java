package com.springdemo;

import java.util.Random;

public class RandomFortune implements FortuneService {

	@Override
	public String getFortune() {
		String[] fortunes= {"Money is coming","you will lose job","you will find love"};
		Random r=new Random();
		int random=r.nextInt(fortunes.length);
		
		return fortunes[random];
	}

}
