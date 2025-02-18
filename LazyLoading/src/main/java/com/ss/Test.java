package com.ss;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Test {
	@Value("Shiva")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Test() {
		super();
		System.out.println("Test constructor called");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Test [name=" + name + "]";
	}
	
	
}
