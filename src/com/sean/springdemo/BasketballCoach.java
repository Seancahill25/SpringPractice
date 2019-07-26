package com.sean.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class BasketballCoach implements Coach {

	private AdviceService adviceService;
	
	@Value("${info.email}")
	private String emial;
	
	@Value("${info.team}")
	private String team;
	
	public BasketballCoach(AdviceService theAdviceService) {
		adviceService = theAdviceService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Shoot the ball 100 times.";
	}

	@Override
	public String getDailyAdvice() {
		return adviceService.getAdvice();
	}

	public String getEmial() {
		return emial;
	}

	public String getTeam() {
		return team;
	}
	
	
}
