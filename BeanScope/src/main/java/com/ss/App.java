package com.ss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student s1 = context.getBean("student",Student.class);
		Student s2 = context.getBean("student",Student.class);
		System.out.println("Address of s1 is : "+System.identityHashCode(s1));
		System.out.println("Address of s2 is : "+System.identityHashCode(s2));
		System.out.println("So we can say Student has bydefault singleton scope");
		
		Employee e1 = context.getBean("employee",Employee.class);
		Employee e2 = context.getBean("employee",Employee.class);
		System.out.println("\nAddress of e1 is : "+System.identityHashCode(e1));
		System.out.println("Address of e2 is : "+System.identityHashCode(e2));
		System.out.println("So we can say Employee has prototype scope");







	}

}
