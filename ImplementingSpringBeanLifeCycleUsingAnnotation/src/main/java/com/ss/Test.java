package com.ss;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Test {
	@Value("Shiva")
	private String name;
	
	

	public Test() {
		super();
		System.out.println("Bean instanciated");
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@PostConstruct
	public void myInit() throws Exception{
		System.out.println("My Init method called");
	}
	
	@PreDestroy
	public void myDestroy() throws Exception{
		System.out.println("My Destroy method called");
	}
	
	public void utilityMethod() {
		System.out.println("Utility method called");
	}

}
