package com.spring.annotations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneServvice {

	private String fileName = "./src/fortunes.txt";
	private List<String> theFortunes;
	
	Random ran=new Random();
	
	public RandomFortuneService() {
		File theFile = new File(fileName);
		
		
		// initialize array list
		theFortunes = new ArrayList<String>();
		
		// read fortunes from file
		try (BufferedReader br = new BufferedReader(
				new FileReader(theFile))) {

			String tempLine;

			while ((tempLine = br.readLine()) != null) {
				theFortunes.add(tempLine);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String getFortune() {

		
		int myFortune=ran.nextInt(theFortunes.size());
		return theFortunes.get(myFortune);
	}

}
