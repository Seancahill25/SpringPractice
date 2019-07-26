package com.sean.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomAdviceService implements AdviceService {

	private String[] data = {
			"Remember to brush your teeth",
			"Don't accept candy from strangers",
			"Drugs are bad mmmmkay"
	};
	
	private Random myRandom = new Random();
	
	@Override
	public String getAdvice() {
		int index = myRandom.nextInt(data.length);
		String theAdvice = data[index];
		
		return theAdvice;
	}

}
