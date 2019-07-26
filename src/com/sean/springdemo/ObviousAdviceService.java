package com.sean.springdemo;

import org.springframework.stereotype.Component;

@Component
public class ObviousAdviceService implements AdviceService {

	@Override
	public String getAdvice() {
		return "Don't mess up!";
	}

}
