package com.ss;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private int id;
	private String name;
	private int age;
	public void study() {
		System.out.println("Student is reading book");
	}
}
