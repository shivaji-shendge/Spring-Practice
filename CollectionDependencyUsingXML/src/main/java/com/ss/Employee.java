package com.ss;

import java.util.*;

public class Employee {
	private int id;
	private String name;
	private List<String> contacts;
	private Set<String> address;
	private Map<String, String> courses;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getContacts() {
		return contacts;
	}
	public void setContacts(List<String> contacts) {
		this.contacts = contacts;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Employee(int id, String name, List<String> contacts, Set<String> address, Map<String, String> courses) {
		super();
		this.id = id;
		this.name = name;
		this.contacts = contacts;
		this.address = address;
		this.courses = courses;
	}
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", contacts=" + contacts + ", address=" + address
				+ ", courses=" + courses + "]";
	}
	
	
}
