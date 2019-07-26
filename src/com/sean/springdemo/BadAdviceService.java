package com.sean.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BadAdviceService implements AdviceService {

	@Override
	public String getAdvice() {
		return "Never strech before training";
	}

}
