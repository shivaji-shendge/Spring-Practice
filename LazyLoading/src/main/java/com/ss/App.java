package com.ss;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String x[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		System.out.println("after Context loaded");
		System.out.println("Accessing Test first time by get bean...");
		Test t = context.getBean("test",Test.class);
		
	}
	
}
