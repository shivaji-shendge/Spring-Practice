package com.ss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//here we are using AbstractApplication context bqz to call the destroy method of bean life cyle .when we call registerShutdown hook then it will call destroy method internally
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student s =(Student) context.getBean("s1"); 
		System.out.println(s);
		context.registerShutdownHook();
	}

}
