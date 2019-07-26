package com.sean.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach theCoach = (context.getBean("wrestlingCoach", Coach.class));
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyAdvice());
		
		context.close();
	}
}
