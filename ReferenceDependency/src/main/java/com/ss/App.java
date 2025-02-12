package com.ss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		A a= (A)context.getBean("aref");
		System.out.println(a.getX());
		System.out.println(a.getOb().getY());


	}

}
