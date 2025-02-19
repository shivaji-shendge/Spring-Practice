package com.ss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DbConfig.class);
		DriverManagerDataSource datasource = context.getBean("db",DriverManagerDataSource.class);
		if(datasource!=null) {
			System.out.println("Database is connected");
		}
		else {
			System.out.println("Database is not connected");
		}
	}

}
