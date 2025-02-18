package com.ss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Test t = context.getBean("test",Test.class);
		t.utilityMethod();
		context.close();

	}

}
