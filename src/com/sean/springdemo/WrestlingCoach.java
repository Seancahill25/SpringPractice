package com.sean.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class WrestlingCoach implements Coach {

	@Autowired
	@Qualifier("randomAdviceService")
	private AdviceService adviceService;
		
	public WrestlingCoach() {
		System.out.println("WrestlingCoach: inside default constructor");
	}
	
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("WrestlingCoach: inside of doMyStartupStuff()");
	}
	
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("WrestlingCoach: inside of doMyCleanupStuff()");
	}
	
	/*
	@Autowired
	public void setAdviceService(AdviceService theAdviceService) {
		System.out.println("WrestlingCoach: inside setAdviceService() method");
		adviceService = theAdviceService;
	}
	*/
	
	/*
	@Autowired
	public WrestlingCoach(AdviceService theAdviceService) {
		adviceService = theAdviceService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice for 1 hour";
	}

	@Override
	public String getDailyAdvice() {
		return adviceService.getAdvice();
	}
}
