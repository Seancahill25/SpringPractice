package com.sean.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("wrestlingCoach", Coach.class);
		Coach otherCoach = context.getBean("wrestlingCoach", Coach.class);
		
		boolean result = (theCoach == otherCoach);
		
		System.out.println("\nPointing to the same object: " + result);
		System.out.println("\nMemory location for theCoach: " + theCoach);
		System.out.println("\nMemory location for otherCoach: " + otherCoach);
		
		context.close();
	}
}
