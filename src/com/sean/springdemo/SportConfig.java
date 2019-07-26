package com.sean.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration 
//@ComponentScan("com.sean.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	@Bean
	public AdviceService meanAdviceService() {
		return new MeanAdviceService();
	}
	
	@Bean
	public Coach basketballCoach() {
		return new BasketballCoach(meanAdviceService());
	}
	
}
