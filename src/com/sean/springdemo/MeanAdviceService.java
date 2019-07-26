package com.sean.springdemo;

public class MeanAdviceService implements AdviceService {

	@Override
	public String getAdvice() {
		return "Have you tried not being awful?";
	}
}
