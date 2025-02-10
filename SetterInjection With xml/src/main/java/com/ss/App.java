package com.ss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		System.out.println("Before the line application context");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		System.out.println("Before get bean method");
		Student s = (Student) context.getBean("student1");
		System.out.println(s);
	}

}
