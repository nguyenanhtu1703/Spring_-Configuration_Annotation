package com.spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.spring.test");
		context.refresh();
		MyBean myBean = context.getBean(MyBean.class);
		System.out.println(myBean.toString());
	}
}
