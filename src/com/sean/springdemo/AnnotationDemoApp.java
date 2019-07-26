package com.sean.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = (context.getBean("wrestlingCoach", Coach.class));
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyAdvice());
		
		context.close();
	}
}
