package com.sean.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasketballJavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		BasketballCoach theCoach = (context.getBean("basketballCoach", BasketballCoach.class));
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyAdvice());
		System.out.println("email: " + theCoach.getEmial());
		System.out.println("team: " + theCoach.getTeam());
		
		context.close();
	}
}
