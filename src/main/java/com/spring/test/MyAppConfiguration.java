package com.spring.test;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class MyAppConfiguration {
	
	@Bean(initMethod = "init")
	public MyBean get() {
		return new MyBean();
	}
	
}
