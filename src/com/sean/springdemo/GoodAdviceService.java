package com.sean.springdemo;

import org.springframework.stereotype.Component;

@Component
public class GoodAdviceService implements AdviceService {

	@Override
	public String getAdvice() {
		return "Sweep the legs";
	}

}
