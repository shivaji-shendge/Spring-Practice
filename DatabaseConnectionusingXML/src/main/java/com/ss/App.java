package com.ss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		DriverManagerDataSource datasourse =(DriverManagerDataSource) context.getBean("conn");
		if(datasourse!=null) {
			System.out.println("Database is connected");
		}
		else {
			System.out.println("Database is not connected");
		}

	}

}
