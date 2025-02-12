package com.ss;

public class Student {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	System.out.println("Setting property via setter method");
	this.name = name;
}


public Student(String name) {
	super();
	this.name = name;
}


public Student() {
	super();
	// TODO Auto-generated constructor stub
}


@Override
public String toString() {
	return "Student [name=" + name + "]";
}

//This two methods will automatically called
public void init() {
	System.out.println("Inside intit method");
}

public void destroy() {
	System.out.println("Inside destroy method");
}

}
