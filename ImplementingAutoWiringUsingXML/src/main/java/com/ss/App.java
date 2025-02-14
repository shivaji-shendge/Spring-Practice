package com.ss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main(String x[]) {
	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	Employee e = (Employee) context.getBean("employee");
	System.out.println(e);
	
}
}
